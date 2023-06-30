package com.lld.version2;

public class Crow extends Bird{

    public Crow(String birdColor, int birdWeight, String birdName) {
        super(birdColor, birdWeight, birdName);
    }

    @Override
    public void fly() {
        System.out.println("Crow flies");
    }

    @Override
    public void makeSound() {
        System.out.println("Crow caw");
    }

    @Override
    public void dance() {
        System.out.println("Crow dances");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
