package com.company;



public class Homework2 {
    public static void main(String[] args) {
        integerArray();
        zeroArray();
        multiplyArray();
        unitsArray();
        minMaxArray();
        emptyArray();
        System.out.println(emptyArray(new int[] {2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println(emptyArray(new int[] {1, 1, 1, 2, 1}));
        methodArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, -3);

    }

    private static void emptyArray() {
    }



    /* 1.Задать целочисленный массив, состоящий из элементов 0 и 1.
    *Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
    *заменить 0 на 1, 1 на 0; */

    public static void integerArray()
    {
        System.out.println("Задание 1");
        int[] arr = new int[]{1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0};
        System.out.print("До: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.print("\nПосле: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /* 2.Задать пустой целочисленный массив размером 8.
    *С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/

    public static void zeroArray()
    {
        System.out.println("\nЗадание 2");

        int[] zero = new int[8];
        for (int i = 0, j = 0; i < zero.length; i++, j += 3)
        {
            zero[i] = j;
            System.out.print(zero[i] + " ");
        }
        System.out.println();
    }


    /* 3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    *пройти по нему циклом, и числа меньшие 6 умножить на 2;*/

    public static void multiplyArray()
    {
        System.out.println("\nЗадание 3");

        int[] multiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("До: ");
        for (int i : multiply) {
            System.out.print(i + " ");
        }
        System.out.print("\nПосле: ");
        for (int i = 0; i < multiply.length; i++) {
            if (multiply[i] < 6) {
                multiply[i] *= 2;
                System.out.print(multiply[i] + " ");
            }
        }
        System.out.println();

    }

    /* 4.Создать квадратный двумерный целочисленный массив
    *количество строк и столбцов одинаковое), и с помощью цикла(-ов)
    *заполнить его диагональные элементы единицами;*/

    public static void unitsArray()
    {
        System.out.println("\nЗадание 4");

        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if ((i == j) || (i == 5 - 1 - j))
                {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    /* 5.Задать одномерный массив и найти в нем минимальный и максимальный
    *элементы (без помощи интернета); */

    public static void minMaxArray()
    {
        System.out.println("\nЗадание 5");

        int[] arr = {4, 3, 1, 9, 6, 4, 7, 8,};
        int min = arr[0];
        int max = arr[0];
        System.out.print("Массив: ");
        for (int i : arr)
        {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length; i++)
        {
            min = (min < arr[i]) ? min : arr[i];
            max = (max > arr[i]) ? max : arr[i];
        }
        System.out.println("\nМинимальное значение в массиве: " + min
                + "\nМаксимальное значение в массиве: " + max);
    }
    /*Написать метод, в который передается не пустой одномерный целочисленный массив,
    *метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    *Примеры:
    * checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    * checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.*/
    public static boolean emptyArray(int[] arr)
    {
        System.out.println("\nЗадание 6");

        int leftA, rightB;

        for (int i = 0; i < arr.length + 1; i++)
        {
            leftA = 0;
            rightB = 0;

            for (int j = 0; j < i; j++)
            {
                leftA += arr[j];
            }

            for (int j = i; j < arr.length; j++)
            {
                rightB += arr[j];
            }

            if (leftA == rightB)
            {
                return true;
            }
        }
        return false;

    }

    /*Написать метод, которому на вход подается одномерный массив и число n
    *(может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
    * Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо)
    * -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево)
    * -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.*/

    public static void methodArray(int[] arr, int n)
    {
        System.out.println("\nЗадание 7");

        System.out.println("(n = " + n + ")");
        System.out.print("До: ");
        for (int i : arr)
        {
            System.out.print(i + " ");
        }

        if (n > 0)
        {
            for (int i = 0; i < n; i++)
            {
                int sup = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--)
                {
                    arr[j] = arr[j - 1];
                }
                arr[0] = sup;
            }
        }
        else if (n < 0)
        {
            for (int i = 0; i < n * (-1); i++)
            {
                int sup = arr[0];
                for (int j = 0; j < arr.length - 1; j++)
                {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = sup;
            }
        }

        System.out.print("\nПосле: ");
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }

}
