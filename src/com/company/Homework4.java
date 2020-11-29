package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    static final int SIZE = 3;
    //static final int DOTS_TO_WIN = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char [][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if(checkWin(DOT_X)){
                System.out.println("Вы выиграли!!!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn(DOT_O);
            printMap();
            if(checkWin(DOT_O)){
                System.out.println("Комьютер победил");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();
        }
    }

    static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("input coord X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;
    }

    static void aiTurn(char c) {
        int x = 0;
        int y = 0;
        int vertical = 0;
        int verticalNull = 0;
        int horizontal = 0;
        int horizontalNull = 0;
        int diagonalA = 0;
        int diagonalB = 0;
        int diaAnull = 0;
        int diaBnull = 0;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;

        for (int i = 0; i < SIZE; i++) {
            //Вертикаль
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == DOT_X) vertical++;
                else if (map[j][i] == DOT_EMPTY) verticalNull++;
                if ((vertical == SIZE - 1) && (verticalNull == 1)) {
                    for (int k = 0; k < SIZE; k++) {
                        if (map[k][i] == DOT_EMPTY) {
                            map[k][i] = c;
                            return;
                        }
                    }
                }
                //Горизонталь
                if (map[i][j] == DOT_X) horizontal++;
                else if (map[i][j] == DOT_EMPTY) horizontalNull++;
                if ((horizontal == SIZE - 1) && (horizontalNull == 1)) {
                    for (int k = 0; k < SIZE; k++) {
                        if (map[i][k] == DOT_EMPTY) {
                            map[i][k] = c;
                            return;
                        }
                    }
                }
            }
            //Диагональ А
            if(map[i][i] == DOT_X) diagonalA++;
            else if(map[i][i] == DOT_EMPTY) diaAnull++;
            if((diagonalA == SIZE - 1) && (diaAnull == 1)){
                for (int j = 0; j < SIZE; j++) {
                    if(map[j][j] == DOT_EMPTY){
                        map[j][j] = c;
                        return;
                    }

                }
            }
            if(map[i][SIZE - 1 - i] == DOT_X) diagonalB++;
            else if(map[i][SIZE - 1 - i] == DOT_EMPTY) diaBnull++;
            if((diagonalA == SIZE - 1) && (diaBnull == 1)){
                for (int j = 0; j < SIZE; j++) {
                    if(map[j][SIZE - 1 - j] == DOT_EMPTY){
                        map[j][SIZE - 1 - j] = c;
                        return;
                    }

                }
            }
        }


    }


    static boolean isCellValid(int y, int x) {
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkWin(char c) {
        int vertical;
        int horizontal;
        int diagonalA = 0;
        int diagonalB = 0;
        for (int i = 0; i <= SIZE - 1; i++) {
            horizontal = 0;
            vertical = 0;
            for (int j = 0; j <= SIZE- 1; j++) {
                //Горизонталь
                if (map[i][j] == c) {
                    horizontal++;
                    if (horizontal == SIZE) return true;
                }

                //Вертикаль
                if (map[j][i] == c) {
                    vertical++;
                    if (vertical == SIZE) return true;
                }
            }

            //  Диагональ А
            if (map[i][i] == c) {
                diagonalA++;
                if (diagonalA == SIZE) return true;
            } else diagonalA = 0;

            // Диагональ В
            if (map[i][SIZE - 1 - i] == c) {
                diagonalB++;
                if (diagonalB == SIZE) return true;
            } else diagonalB = 0;
        }
        return false;

    }


}
