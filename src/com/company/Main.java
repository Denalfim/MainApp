package com.company;

public class Main {

    public static void main(String[] args) {
        variables();
        System.out.println("a * (b + (c / d)) = " + calculate(2f,20f,30.5f,12.5f));
        System.out.println(limitMethod(3,9));
        positiveOrNegative(-5);
        System.out.println(integerMethod(2));
        nameOutput("Фанзиль Кусяпкулов");


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
    public static float calculate (float a, float b, float c, float d){
        System.out.println("\nЗадание #2");
        return a * (b + ( c / d));
    }

    //Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    // в противном случае – false.

    public static boolean limitMethod(int a, int b){
        System.out.println("\nЗадание #3");
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }

    //Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали
    // или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void positiveOrNegative(int a){
        System.out.println("\nЗадание #4");
        if (a>=0) {
            System.out.println("Число a = " + a + " (положительное)");
        } else {
            System.out.println("Число a = " + a + " (отрицательное)");
        }
    }

    //Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false
    // если положительное. Замечание: ноль считаем положительным числом.

    public static boolean integerMethod(int a){
        System.out.println("\nЗадание #5");
        if (a <=0) {
            return true;
        } else {
            return false;
        }

    }

    //Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    //Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    public static void nameOutput(String name){
        System.out.println("\nЗадание #6");
        System.out.println("Привет, " + name + "!");
    }
}
