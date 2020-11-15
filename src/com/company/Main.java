package com.company;

public class Main {

    public static void main(String[] args) {
        variables();


    }
    // Создать переменные всех пройденных типов данных и инициализировать их значения.
    static void variables(){
        System.out.println("Задание #1\n");
        byte bt = 2;
        short st = 125;
        int in = 12345678;
        long lg = 87987L;
        float ft = 587.0f;
        double db = 8989.855;
        char cr = '\u2605';
        boolean bn = false;
        System.out.println("Значение типа byte = " + bt);
        System.out.println("Значение типа short = " + st);
        System.out.println("Значение типа int = " + in);
        System.out.println("Значение типа long = " + lg);
        System.out.println("Значение типа float = " + ft);
        System.out.println("Значение типа double = " + db);
        System.out.println("Значение типа char = [" + cr + "]");
        System.out.println("Значение типа boolean = " + bn);

    }
}
