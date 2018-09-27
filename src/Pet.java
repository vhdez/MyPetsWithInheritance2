package org.sla;

class Pet {
    // Fields
    private int age;
    private String name;
    private String petType;
    private boolean eatsDryFood;

    // Constructors
    Pet(int theAge, String theName,
        String thePetType, boolean eatsWhat) {
        age = theAge;
        name = theName;
        petType = thePetType;
        eatsDryFood = eatsWhat;
    }

    // Methods

    void sayHi() {
        System.out.println("I don't know.  Don't ask me.");
    }

    int getAge() {
        return age;
    }

    String getPetType() {
        return petType;
    }

    String getName() {
        return name;
    }

    boolean getEatsDryFood() {
        return eatsDryFood;
    }

    void describe() {
        System.out.println("I'm a pet.");
    }

}
