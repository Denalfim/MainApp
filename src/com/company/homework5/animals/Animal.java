package com.company.homework5.animals;

abstract class Animal {
   String name;

    private static int animals;

    static {
        animals = 0;
    }
    public static int getAnimals() {
        return animals;
    }

    public Animal(String name) {
        this.name = name;
        animals++;
    }

    abstract void run(int length);

    abstract void swim(int length);


}
