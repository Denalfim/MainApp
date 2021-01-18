package level.two.homework6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private final static String SERVER_ADDR = "localhost";
    private final static int SERVER_PORT = 8189;

    private static Socket socket;
    private static DataInputStream in;
    private static DataOutputStream out;

    private static boolean isRunning;

    public static void main(String[] args) {
        try {
            connectToServer();
            closeConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void connectToServer() throws IOException {
        socket = new Socket(SERVER_ADDR, SERVER_PORT);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());

        isRunning = true;

        Thread trIn = new Thread(() -> {
            try {
                while (isRunning) {
                    if (!socket.isConnected()) {
                        System.out.println("Server is disconnected");
                        isRunning = false;
                        break;
                    }

                    String str = in.readUTF();

                    if (str.equalsIgnoreCase("/end")) {
                        System.out.println("Сервер отключился");
                        isRunning = false;
                        break;
                    }

                    System.out.println("Server say: " + str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Thread trOut = new Thread(() -> {
            Scanner sc = new Scanner(System.in);
            try {
                while (isRunning) {
                    if (!socket.isConnected()) {
                        isRunning = false;
                        break;
                    }

                    String str = sc.nextLine();
                    out.writeUTF(str);

                    if (str.equalsIgnoreCase("/end")) {
                        isRunning = false;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        trIn.start();
        trOut.start();

        try {
            trIn.join();
            trOut.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection() throws IOException {
        in.close();
        out.close();

        if (!socket.isClosed()) {
            socket.close();
        }
    }
}

