package com.lld.version2;



public abstract class Bird {

    protected String birdColor;
    protected int birdWeight;
    protected String birdName;

    protected abstract void fly();
    protected abstract void makeSound();
    protected abstract void dance();

    public Bird(String birdColor, int birdWeight, String birdName) {
        this.birdColor = birdColor;
        this.birdWeight = birdWeight;
        this.birdName = birdName;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "birdColor='" + birdColor + '\'' +
                ", birdWeight=" + birdWeight +
                ", birdName='" + birdName + '\'' +
                '}';
    }
}
