package com.company;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
//        int a = 3;
//        if(a == 1) {
//            System.out.println("a = 1");
//        } else if (a == 3) {
//            System.out.println("a = 3");
//        } else {
//            System.out.println("Ни одно условие не сработало");
//        }
//
//
//        int b = 5;
//        switch (b){
//            case 1:
//                System.out.println("b = 1");
//                break;
//            case 5:
//                System.out.println("b = 5");
//                break;
//            default:
//                System.out.println("Ни одно условие не сработало");
//        }
//
//        for (int i = 0; i < 5; i++){
//            System.out.println("i = " + i);
//        }
//        System.out.println("end");
//
//
//        //Отрицательное приращение счетчика
//        int x;
//        for (x = 10; x>=0; x -= 5){
//            System.out.println(x + " ");
//        }
//
//        for (int i = 0, j = 10; i < j; i++, j--){
//            System.out.println("i-j: " +i + "-" + j);
//        }
//        //Бесконечный цикл
//        // for (;;){
//        // //////
//        // }
//
//
//        // оператор break
//        for(int i = 0; i < 10; i++){
//            if (i > 3){
//                break;
//            }
//            System.out.println("i = " + i);
//        }
//
//        String[] sm = {"A", "B", "C", "D"};
//        for (String o : sm){
//            System.out.print(o + " ");
//        }
//
//        //Вложенные циклы
//        for(int i = 0; i < 3; i++){
//            for (int j = 0; j < 3; j++){
//                System.out.print(" " + i + j);
//            }
//        }
//
//        int p = 0;
//        for(int count = 10; count < 5; count++){
//           p += count;
//        }
//
//
//        //кодовые блоки
//
//        int w =1, h = 2, v = 0;
//        if (w < h){
//            v=w*h;
//            w = 0;
//        }
//
//        int a = 0, b = 10, c = 0;
//        if (a != 0){
//            System.out.println("а не равно нулю");
//            c = b / a;
//            System.out.println(" b / a равно " + c);
//        } else {
//            System.out.println("a = 0. Делить на ноль нельзя");
//        }
//
//
//        int x = 10;
//        if (x == 10){
//            int y = 20;
//            System.out.println("x & y: " + x + " " +y);
//            x = y * 2;
//        }
////        y = 100;
//        System.out.println("x = " + x);
//
//
//        for (int i = 0; i < 3; i++){
//            int y = -1;
//            System.out.println("y = " + y);
//            y++;
//            System.out.println("y = " + y);
//        }
//        int[] arr = new int[5];
//        for(int i = 0; i < 5; i++){
//            arr[i] = i;
//            System.out.println("arr [" + i + "] = " + arr[i]);
//        }
//
//        String[] cor = {"A", "B", "C", "D"};
//        System.out.println(Arrays.toString(cor));


        //Двумерный массив
        int counter = 1;
        int[][] table = new int [3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
// Нерегулярные массивы
        int [][] tableTwo = new int[3][];
        tableTwo[0] = new int[1];
        tableTwo[1] = new int[5];
        tableTwo[2] = new int[3];
// Получение длинны массива
        int [] arrTwo = {2, 4, 5, 1, 2, 3, 4, 5};
        System.out.println("arrTwo.length: " + arrTwo.length);
        for(int i = 0; i < arrTwo.length; i++){
            System.out.print(arrTwo[i] + " ");
        }
    }


}
