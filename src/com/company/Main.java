package com.company;

import com.company.food.Dogfood;
import com.company.species.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // random animals
        Dog dog = new Dog("Lucky");
        Dog dog2 = new Dog("Senna");
        Cat cat = new Cat("Kitty");
        Turtle turtle = new Turtle();
        Frog frog = new Frog();
        Eagle eagle = new Eagle("Birdy");

        Animal[] animals = new Animal[] {
            dog, cat, turtle, frog, eagle, dog2
        };

        Dog[] dogs = new Dog[] {
                dog, dog2
        };

        ArrayList inventory = new ArrayList<isSellable>();
        inventory.add(new Dogfood());

        System.out.println("All classes in the list");

        for (Animal animal: animals ){
            animal.makeSound();

            // instanceOf declaration
            if (animal instanceof isSellable) {
                    // cast
                    // as soon as an animal in the array of animals has the declaration of isSellable it gets added to
                    // inventory
                    inventory.add((isSellable)animal);
            }
        }

        // Dogs have the same property as cats
        System.out.println("\nAll dogs have a name: ");
        for (Animal e: dogs) {
            e.getName();
        }

        // print all objects that have been added to inventory

        System.out.println("\nprint all objects that have been added to inventory");
        for (Object item: inventory) {
            System.out.println(item);
        }
    }
}
