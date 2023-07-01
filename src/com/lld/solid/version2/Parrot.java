package com.lld.solid.version2;

public class Parrot extends Bird{

    public Parrot(String birdColor, int birdWeight, String birdName) {
        super(birdColor, birdWeight, birdName);
    }

    @Override
    public void fly() {
        System.out.println("Parrot flies");
    }

    @Override
    public void makeSound() {
        System.out.println("Parrot talk");
    }

    @Override
    public void dance() {
        System.out.println("Parrot dances");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
