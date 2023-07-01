package com.lld.solid.version1;


enum BirdType {PARROT, PIGEON, SPARROW, PEACOCK, CROW}
/*If we try to add behavior for new kind of bird, it will break the Open Close Principle
* as we are modifying makeSound() which violates OCP*/
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

    private void crowSound() {
        System.out.println(birdType+" caw");
    }

    private void peacockSound() {
        System.out.println(birdType+" honk");
    }

    private void sparrowSound() {
        System.out.println(birdType+" buzz");
    }

    private void pigeonSound() {
        System.out.println(birdType+" coo");
    }

    private void parrotSound() {
        System.out.println(birdType+" talk");
    }

    public void fly() {
        System.out.println(birdType+" flies");
    }

    /*Every bird have different type of sound*/
    public void makeSound() throws Exception {
        if (birdType.equalsIgnoreCase(BirdType.PARROT.toString())) {
            parrotSound();
        } else if (birdType.equalsIgnoreCase(BirdType.PIGEON.toString())) {
            pigeonSound();
        } else if (birdType.equalsIgnoreCase(BirdType.SPARROW.toString())) {
            sparrowSound();
        }else if (birdType.equalsIgnoreCase(BirdType.PEACOCK.toString())) {
            peacockSound();
        }else if (birdType.equalsIgnoreCase(BirdType.CROW.toString())) {
            crowSound();
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
