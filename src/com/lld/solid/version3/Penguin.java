package com.lld.solid.version3;

public class Penguin extends Bird implements Danceable, Soundable {
    public Penguin(String name, String colour, int weight) {
        super(name, colour, weight);
    }

    @Override
    public void dance() {
        System.out.println("Penguin dances");
    }

    @Override
    public void sound() {
        System.out.println("Penguin vocalization");
    }
}
