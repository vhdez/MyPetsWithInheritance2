package org.sla;

class MyPets {

    public static void main(String[] args) {
        // I have 3 dogs and 3 cats.

        Pet[] pets = new Pet[6];

        // The 1st pet is a dog named Rufus.
        pets[0] = new Dog(3, "Bowser", "dog", false);

        // The 2nd pet is an older dog named Tully.
        pets[1] = new Dog(14, "Tully", "dog", true);

        // The 3rd pet is an  dog named Gary.
        pets[2] = new Dog(8, "Gary", "dog", false);


        // The 4th pet is an older cat named Ralph.
        pets[3] = new Cat(15, "Ralph", "cat", false);

        // The 5th pet is a cat named Whiskers.
        pets[4] = new Cat(3, "Whiskers", "cat", true);

        // The 6th pet is a cat named Wowser.
        pets[5] = new Cat(9, "Wowser", "cat", false);

        // Tell the pets to say hi.
        System.out.println("SAY HI PETS!");
        for (int i = 0; i < 6; i++) {
            pets[i].sayHi();
        }
        System.out.println();

        // Tell the pets to describe themselves.
        System.out.println("NOW DESCRIBE YOURSELVES:");
        for (int i = 0; i < 6; i++) {
            pets[i].describe();
        }

        // Report cumulative data about pets.
        int totalPetsAge = 0;
        for (int i = 0; i < 6; i++) {
            totalPetsAge = totalPetsAge + pets[i].getAge();
        }
        System.out.println("My pets have lived a total of " + totalPetsAge + " human years.");
    }
}