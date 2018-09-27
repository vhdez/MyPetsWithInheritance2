package org.sla;

class Pet {
    int age;
    String name;
    String petType;
    boolean eatsDryFood;

    protected void sayHi() {
        System.out.println("I don't know.  Don't ask me.");
    }

    protected int getAge() {
        return age;
    }

    protected void describe() {
        System.out.println("I'm a pet.");
    }

}
