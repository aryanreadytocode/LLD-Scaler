package com.lld.solid.version2;

public class Peacock extends Bird{

    public Peacock(String birdColor, int birdWeight, String birdName) {
        super(birdColor, birdWeight, birdName);
    }

    @Override
    public void fly() {
        System.out.println("Peacock flies");
    }

    @Override
    public void makeSound() {
        System.out.println("Peacock honk");
    }

    @Override
    public void dance() {
        System.out.println("Peacock dances");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
