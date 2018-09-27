package org.sla;

class MyPets {

    public static void main(String[] args) {
        // I have 3 dogs and 3 cats.

        // The 1st pet is a dog named Rufus.
        Dog bowser = new Dog();
        bowser.age = 3;
        bowser.name = "Bowser";
        bowser.petType = "dog";
        bowser.eatsDryFood = false;

        // The 2nd pet is an older dog named Tully.
        Dog tully = new Dog();
        tully.age = 14;
        tully.name = "Tully";
        tully.petType = "dog";
        tully.eatsDryFood = true;

        // The 3rd pet is an  dog named Gary.
        Dog gary = new Dog();
        gary.age = 8;
        gary.name = "Gary";
        gary.petType = "dog";
        gary.eatsDryFood = false;

        // The 4th pet is an older cat named Ralph.
        Cat ralph = new Cat();
        ralph.age = 15;
        ralph.name = "Ralph";
        ralph.petType = "cat";
        ralph.eatsDryFood = false;

        // The 5th pet is a cat named Whiskers.
        Cat whiskers = new Cat();
        whiskers.age = 3;
        whiskers.name = "Whiskers";
        whiskers.petType = "cat";
        whiskers.eatsDryFood = true;

        // The 6th pet is a cat named Wowser.
        Cat wowser = new Cat();
        wowser.age = 9;
        wowser.name = "Wowser";
        wowser.petType = "cat";
        wowser.eatsDryFood = false;

        // Tell the pets to say hi.
        System.out.println("SAY HI PETS!");
        bowser.sayHi();
        tully.sayHi();
        gary.sayHi();
        ralph.sayHi();
        whiskers.sayHi();
        wowser.sayHi();
        System.out.println();

        // Tell the pets to describe themselves.
        System.out.println("NOW DESCRIBE YOURSELVES:");
        bowser.describe();
        tully.describe();
        gary.describe();
        ralph.describe();
        whiskers.describe();
        wowser.describe();

        // Report cumulative data about pets.
        int totalPetsAge = bowser.getAge() + tully.getAge() + gary.getAge() + ralph.getAge() + whiskers.getAge() + wowser.getAge();
        System.out.println("My pets have lived a total of " + totalPetsAge + " human years.");
    }
}