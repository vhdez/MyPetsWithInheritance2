package org.sla;

class Dog extends Pet {
    // Fields

    // Constructors
    Dog(int theAge, String theName,
        String thePetType, boolean eatsWhat) {
        super(theAge, theName, thePetType, eatsWhat);
    }

    // Methods

    void sayHi() {
        System.out.println("Woof!");
    }

    void describe() {
        System.out.println("I'm a " + getPetType() + " named " + getName() + ".");
        System.out.println("I'm " + getAge()*7 + " dog years old.");
        if (getEatsDryFood()) {
            System.out.println("I eat dry food.");
        } else {
            System.out.println("I eat wet food.");
        }
        System.out.println();
    }
}