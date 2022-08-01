package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Animal {
    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static List<Animal> getSeederCollection() {
        List<Animal> animals = new ArrayList<>();

        Collections.addAll(animals,
                new Animal(35, "Тузик"),
                new Animal(40, "Валик"),
                new Animal(46, "Колян")
        );

        return animals;
    }

    public static Animal getDefaultAnimal(){
        return new Animal(0, "none");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
