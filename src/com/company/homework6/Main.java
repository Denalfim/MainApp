package com.company.homework6;

public class Main {
    public static void main(String[] args) {
        Cat[] x = {new Cat("Cherry", 70), new Cat("Cucumber", 50), new Cat("Ananas", 60)};
        Plate plate = new Plate(0);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("----------------------------------------------");
        System.out.println("Добавляем еду");
        plate.increaseFood(150);
        System.out.println(plate);
        System.out.println("-----------------------------------------------");
        System.out.println("Кошки едят:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}
