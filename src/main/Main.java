package main;

import animal.Cat;
import animal.Dog;
import animal.Animal;

public class Main {
    public static void main(String[] args) {
       Animal c = new Cat();
       Animal d = new Dog();

       c.bark();
       d.bark();
    }
}