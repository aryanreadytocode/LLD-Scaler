package com.lld.solid.version2;

public class Pigeon extends Bird{

    public Pigeon(String birdColor, int birdWeight, String birdName) {
        super(birdColor, birdWeight, birdName);
    }

    @Override
    public void fly() {
        System.out.println("Pigeon flies");
    }

    @Override
    public void makeSound() {
        System.out.println("Pigeon coo");
    }

    @Override
    public void dance() {
        System.out.println("Pigeon dances");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
