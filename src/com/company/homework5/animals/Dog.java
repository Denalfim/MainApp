package com.company.homework5.animals;

public class Dog extends Animal {
    private static int animals;

    int maxRunLength = 500;
    int maxSwimLength = 10;


    public Dog(String name) {
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
    public void swim(int length) {
        if((length >=0) && (length<=maxSwimLength))
        System.out.println(name + " проплыл " + length + " метров");
        else System.out.println(name + " говорит дистанция слишком большая");

    }
    public static int getAnimals() {
        return animals;
    }
}
