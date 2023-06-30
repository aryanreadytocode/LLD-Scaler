package com.lld.version2;

public class Sparrow extends Bird{

    public Sparrow(String birdColor, int birdWeight, String birdName) {
        super(birdColor, birdWeight, birdName);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flies");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow buzz");
    }

    @Override
    public void dance() {
        System.out.println("Sparrow dances");
    }
}
