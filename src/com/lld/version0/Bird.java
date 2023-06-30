package com.lld.version0;


enum BirdType {PARROT, PIGEON, SPARROW, PEACOCK, CROW}
/* Problem with this design of Bird is, it violates Single Responsibility Principle, every method class package should have single responsibility
* makeSound() method take care of multiple birds sound
* and there is problem with scalability
* So this is version 1 of bird*/
public class Bird {

    private String birdType;
    private String birdColor;
    private int birdWeight;
    private String birdName;

    public Bird(String birdType, String birdColor, int birdWeight, String birdName) {
        this.birdType = birdType;
        this.birdColor = birdColor;
        this.birdWeight = birdWeight;
        this.birdName = birdName;
    }

    public void fly() {
        System.out.println(birdType+" flies");
    }

    /*Every bird have different type of sound*/
    public void makeSound() throws Exception {
        if (birdType.equalsIgnoreCase(BirdType.PARROT.toString())) {
            System.out.println(birdType+" talk");
        } else if (birdType.equalsIgnoreCase(BirdType.PIGEON.toString())) {
            System.out.println(birdType+" coo");
        } else if (birdType.equalsIgnoreCase(BirdType.SPARROW.toString())) {
            System.out.println(birdType+" buzz");
        }else if (birdType.equalsIgnoreCase(BirdType.PEACOCK.toString())) {
            System.out.println(birdType+" honk");
        }else if (birdType.equalsIgnoreCase(BirdType.CROW.toString())) {
            System.out.println(birdType+" caw");
        }else {
            throw new Exception("Bird type "+birdType +" didn't matched");
        }
    }

    public void dance() {
        System.out.println(birdType+" dances");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "birdType='" + birdType + '\'' +
                ", birdColor='" + birdColor + '\'' +
                ", birdWeight=" + birdWeight +
                ", birdName='" + birdName + '\'' +
                '}';
    }
}
