package org.sla;

class Dog extends Pet {

    protected void sayHi() {
        System.out.println("Woof!");
    }

    protected void describe() {
        System.out.println("I'm a " + petType + " named " + name + ".");
        System.out.println("I'm " + age*7 + " dog years old.");
        if (eatsDryFood) {
            System.out.println("I eat dry food.");
        } else {
            System.out.println("I eat wet food.");
        }
        System.out.println();
    }
}