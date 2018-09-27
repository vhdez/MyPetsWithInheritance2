package org.sla;

class Pet {
    int age;
    String name;
    String petType;
    boolean eatsDryFood;

    void sayHi() {
        System.out.println("I don't know.  Don't ask me.");
    }

    int getAge() {
        return age;
    }

    void describe() {
        System.out.println("I'm a pet.");
    }

}
