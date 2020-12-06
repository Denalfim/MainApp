package com.company.homework5.animals;

public class Cat extends Animal {
    private static int animals;

    int maxRunLength = 200;
    int maxSwimLength = 0;

    public Cat(String name) {
        super(name);
        animals++;
    }

    @Override
    public void run(int length) {
        if((length >=0) && (length<=maxRunLength))
            System.out.println(name + " пробежал " + length + " метров");
        else System.out.println(name + " говорит дистанция слишком большая");
    }

    @Override
    public  void swim(int length) {
        System.out.println(name + " не умеет плавать");
    }

    public static int getAnimals() {
        return animals;
    }
}
