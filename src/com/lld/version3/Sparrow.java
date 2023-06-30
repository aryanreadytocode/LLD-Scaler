package com.lld.version3;

public class Sparrow extends Bird implements Flyable, Soundable, Danceable{
    public Sparrow(String name, String colour, int weight) {
        super(name, colour, weight);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flies");
    }

    @Override
    public void sound() {
        System.out.println("Sparrow buzz");
    }

    @Override
    public void dance() {
        System.out.println("Sparrow dances");
    }
}
