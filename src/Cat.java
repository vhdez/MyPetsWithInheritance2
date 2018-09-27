package org.sla;

class Cat extends Pet {

    // Constructors
    Cat(int theAge, String theName,
        String thePetType, boolean eatsWhat) {
        super(theAge, theName, thePetType, eatsWhat);
    }


    void sayHi() {
        System.out.println("Meow!");
    }

    void describe() {
        System.out.println("I'm a " + getPetType() + " named " + getName() + ".");
        System.out.println("I'm " + getAge() + " human years old.");
        if (getEatsDryFood()) {
            System.out.println("I eat dry food.");
        } else {
            System.out.println("I eat wet food.");
        }
        System.out.println();
    }
}