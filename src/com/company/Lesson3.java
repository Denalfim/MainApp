package com.company;

import com.sun.org.apache.xerces.internal.impl.xs.util.XInt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Lesson3 {
//    static Scanner sc;
//    static Random random;

    public static void main(String[] args) {
//        // 10 - 8 - 16 система
//        int x = 10;//10 - десятичная система
//        int y = 010;//8 - java считает это 8-миричная система
//        int z = 0x10;//16 - java считает это 16-тиричная система
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);

        //Любое число в виде 2 ичного 8 16 ричного числа
        int x = 48;
        int y = 39;
//        System.out.println(Integer.toBinaryString(x));
//        System.out.println(Integer.toHexString(x));
//        System.out.println(Integer.toOctalString(x));

//        sc = new Scanner(System.in);
//        random = new Random();


//        int x =sc.nextInt();
//        int y =sc.nextInt();
//        int z =sc.nextInt();
//
//        System.out.printf("%d + %d + %d = %d\n", x, y, z, x + y + z);

        //String name = sc.next();

        //random - генератор псевдослучайных чисел
        //можно указывать не только разброс
        // но и начальное положение .nextInt(10)-10; от -10 до 0;
        // .nextInt(10)+100; от 100 до 110
//        int x =random.nextInt(10);
//        int y =random.nextInt(10);
//
//        //int я = (int) (Math.random() * 10 + 30); - так не делать!!!
//
//        //Math.random - возвращает dooble: генерирует от 0 до 0.99
//
//
//        System.out.printf("%d + %d = %d\n", x, y, x + y);


        //Быстрая сортировка массива
//        int[] arr = {1,2,4,5,6,8,9,7,67,55,43};
////        Arrays.sort(arr);
////        System.out.println(Arrays.toString(arr));
//        System.out.println(sumArr(arr));
//
//        System.out.println(countElemMoreThan(arr,5));
//
//        System.out.println(lastDigit(66789));
//
//        System.out.println(isDiv(77,11));
//
//        System.out.println(isThreeNum(-396));
//
//        System.out.println(isPositiveAndEven(23));
//
//        System.out.println(sum(2,7));
//        System.out.println(sum(2,4,7));
//        System.out.println(sum(3,5,7,8));
//        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9));
        printBinary(x);
        printBinary(y);
//      int z = x & y; //побитовое умножение, бит умножается на бит другова числа
//      printBinary(z);

//      int z = x | y; // побитовое сложение, каждый бит складывается логически
//      printBinary(z);

//      int z = x ^ y; // исключающий или. Будет 1 если биты разные а если биты одинаковые то 0
//      printBinary(z);

//        int z = ~x; // каждый бит будет переделан(перевернут)
//        z++;
//        printBinary(z);

        //Побитовый сдвиг
        int z=x<<1; // умножение числа само на переменную до 32 раз
        printBinary(z);
        // int z = x >>1 // деление // x>>>3 (независимо от знака добавить 3 нуля спереди)
    }

    public static void printBinary(int x){
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(x));
        while(sb.length()<32){
            sb.insert(0,0);
        }
        System.out.printf("%7d = %s\n", x, sb.toString());
    }

//    //универсальный метод по складыванию - аргумент переменной длинны
//    //(int a, int... arr)  return a + sumArr(arr)- может быть только
//    // один аргумент переменной длинны и всешда должен быть последним
//    // из аргументов
//    public static int sum (int... arr){
//        return sumArr(arr);
//    }
//
//    //сделать метод который находит сумму двух чисел
//    public static int sum(int a, int b){
//        return a + b;
//    }
//
//    //сделать метод который находит сумму трех чисел
//    public static int sum(int a, int b, int c){
//        return a + b +c;
//    }
//
//    //сделать метод который находит сумму четырех чисел
//    public static int sum(int a, int b, int c, int d){
//        return a + b + c + d;
//    }
//
//    // метод вычисляет сумму всех элементов массива
//    public static int sumArr(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        return sum;
//    }
//
//    public static int countElemMoreThan(int[] arr, int num){
//        int k = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > num)
//            {
//                k++;
//            }
//        }
//        return k;
//    }
//
//   //метод выведения последней цифры числа
//    public static int lastDigit(int x){
//        return x % 10; // для отрицательных: Math.abs(x % 10);
//    }
//    // делиттся ли число на другое число
//    public static boolean isDiv(int a, int b){
//        return a%b==0;
//    }
//
//    //является ли число трехзначным
//    public static boolean isThreeNum(int a){
//        return a >=100 && a <= 999 || a<=-100 && a >= -999;
//    }
//
//    //является ли число положительно четным
//    public static boolean isPositiveAndEven(int a){
//        return a > 0 && a % 2==0;
//    }

}
