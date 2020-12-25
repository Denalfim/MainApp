package level.two.homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.println("Введите число строк Массива:");
        int i = sr.nextInt();
        System.out.println("Введите число колонок Массива:");
        int j = sr.nextInt();

        String[][] str = new String[i][j];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.println("Введите строку [" + k + " , " + l + "]:");
                str[k][l] = sr.next();

            }

        }
        //getArraySumm(str);

        try {
            getArraySumm(str);
        } catch (MyArraySizeException e){
            System.out.println("Ошибка размера массива. Массив должен быть 4х4");
        } finally {
            System.out.println("END");
        }

    }

    private static void getArraySumm(String[][] str){
        if(str.length !=4){
            throw new MyArraySizeException();
        }
        for (int i = 0; i < str.length; i++) {
            if(str[i].length != 4){
                throw new MyArraySizeException();
            }
            break;
        }
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                inputDate(str[i][j],i,j);
                sum += Integer.parseInt(str[i][j]);

            }
        }
        System.out.println("Результат: ");
        System.out.println(sum);
    }
    private static void inputDate(String str, int x, int y){

        try {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9'){
                    throw new MyArrayDataException(x,y);
                }
            }
        } catch (MyArrayDataException e){
            e.printStackTrace();
        }
    }
}
