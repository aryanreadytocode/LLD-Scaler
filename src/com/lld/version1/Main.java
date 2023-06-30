package com.lld.version1;

import com.lld.version0.Bird;

public class Main {

    public static void main(String[] args) throws Exception {
        com.lld.version0.Bird bird1 = new com.lld.version0.Bird("Pigeon", "white", 300, "bird1");
        com.lld.version0.Bird bird2 = new com.lld.version0.Bird("sparrow", "grey", 50, "bird2");
        com.lld.version0.Bird bird3 = new Bird("Penguin", "Black&White", 50000, "bird3");

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
