package com.lld.version0;

public class Main {

    public static void main(String[] args) throws Exception {

        Bird bird1 = new Bird("Pigeon", "white", 300, "bird1");
        Bird bird2 = new Bird("sparrow", "grey", 50, "bird2");
        Bird bird3 = new Bird("Penguin", "Black&White", 50000, "bird3");

        bird1.makeSound();
        bird2.makeSound();
        bird3.makeSound();

        bird1.dance();
        bird2.dance();
        bird3.dance();

        bird1.fly();
        bird2.fly();
        bird3.fly();

        System.out.println(bird1);
        System.out.println(bird2);
        System.out.println(bird3);
    }
}
