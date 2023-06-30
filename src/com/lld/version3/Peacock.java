package com.lld.version3;

public class Peacock extends Bird implements Danceable, Soundable{

    public Peacock(String name, String colour, int weight) {
        super(name, colour, weight);
    }

    @Override
    public void dance() {
        System.out.println("Peacock dances");
    }

    @Override
    public void sound() {
        System.out.println("Peacock honk");
    }
}
