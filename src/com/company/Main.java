package com.company;

public class Main {

    public static void main(String[] args) {
        variables();
        System.out.println("a * (b + (c / d)) = " + calculate(5,2,3,4));


    }
    // Создать переменные всех пройденных типов данных и инициализировать их значения.
    public static void variables(){
        System.out.println("\nЗадание #1");
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

    //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static int calculate (int a, int b, int c, int d){
        System.out.println("\nЗадание #2");
        return a * (b + ( c / d));
    }

}
