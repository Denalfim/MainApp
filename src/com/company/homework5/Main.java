package com.company.homework5;

import com.company.homework5.animals.*;//все классы из этого пакета импортируются

public class Main {

    public static void main(String[] args) {
    Cat cat = new Cat("Barsic");
    cat.run(150);
    cat.swim(2);

    Dog dog = new Dog("Tuman");
    dog.run(300);
    dog.swim(10);

    System.out.println(Cat.getAnimals());
    System.out.println(Dog.getAnimals());
    }


}
