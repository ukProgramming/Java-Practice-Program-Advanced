package com.polymorphism;


public class Animal {
    public void eat() {
        System.out.println(" Animal is Sleeping...");

    }

    public void sleep() {
        System.out.println(" Animal is Sleeping...");
    }
}

class Tiger extends Animal {

    public void eat() {
        System.out.println("Tiger is Eating...");
    }

    public void sleep() {
        System.out.println("Tiger is Sleeping...");
    }
}

class Monkey extends Animal {

    public void eat() {
        System.out.println("Monkey is Eating...");
    }

    public void sleep() {
        System.out.println("Monkey is Sleeping...");
    }
}

class Deer extends Animal {

    public void eat() {
        System.out.println("Deer is Eating...");
    }

    public void sleep() {
        System.out.println("Deer is Sleeping...");
    }
}

class Forest {
    public void wild(Animal animal) {
        animal.eat();
        animal.sleep();
    }
}

class Test {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        Monkey monkey = new Monkey();
        Deer deer = new Deer();

        Forest forest = new Forest();
        forest.wild(tiger);
        forest.wild(monkey);
        forest.wild(deer);















        /*
        tiger.eat();  <- This is Not Polymorphism Because it refer 1 to 1 Relation it is Tightly Coupled we have make
        it loosleuy coupled...
        tiger.sleep();

        monkey.eat();
        monkey.sleep();*/


//        Animal a;
//        a=tiger;
//        a.eat();
//        a.sleep();
//
//        a=monkey;
//        a.eat();     <=50 % of Polymorphism are achieve but not 100 %.
//        a.sleep();
//
//        a=deer;
//        a.eat();
//        a.sleep();
    }
}