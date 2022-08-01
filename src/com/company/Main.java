package com.company;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Animal> animals = Animal.getSeederCollection();

//        animals.stream().filter(item -> item.getAge() >= 40).map(Animal::getName).forEach(System.out::println);

//       Optional<Animal> animal = animals.stream().filter(item -> item.getAge() >= 60).findFirst();
//
//        if(animal.isPresent()) {
//            System.out.println(animal.get().getName());
//        }else{
//            System.out.println("nothing");
//        }

        //Animal animal = animals.stream().filter(item -> item.getAge() >= 60).findFirst().orElse(new Animal(0,"none"));

//        Animal animal = animals.stream().filter(item -> item.getAge() >= 40).findFirst().orElse(Animal.getDefaultAnimal());
//
//        System.out.println(animal);

//        animals.stream().filter(item -> item.getAge() >= 40).findFirst().ifPresent(
//                System.out::println
//        );

//        Animal animal = animals.stream().filter(item -> item.getAge() >= 40).findFirst().orElseThrow(()->new Exception("element not found"));
//
//        System.out.println(animal);

//        Animal animal = animals.stream().filter(item -> item.getAge() >= 40).findFirst().orElseGet(() -> {
//            //sdfsdf/sd/fg/ds/f
//            return new Animal(0, "");
//        });

//        System.out.println(animal);
        
    }
}
