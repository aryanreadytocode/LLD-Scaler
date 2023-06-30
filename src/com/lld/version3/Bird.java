package com.lld.version3;

public abstract class Bird {
    protected String name;
    protected String colour;
    protected int weight;

    void breath() {
        System.out.println("Animal breathe");
    }

    public Bird(String name, String colour, int weight) {
        this.name = name;
        this.colour = colour;
        this.weight = weight;
    }
}