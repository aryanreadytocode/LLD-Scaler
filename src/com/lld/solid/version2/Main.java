package com.lld.solid.version2;
/*If you want to add non-flyable bird like penguin how you're going to manage fly method
* in penguine class
* Two option we have first keep fly method empty in Penguin class
* second option we can throw exception saying penguin doesn't fly in fly method*/
public class Main {

    public static void main(String[] args) {

        Bird bird1 = new Peacock("multi-color", 2500, "bird1");
        bird1.dance();
        bird1.fly();
        bird1.makeSound();

        Bird bird2 = new Pigeon("black", 250, "bird2");
        bird2.dance();
        bird2.fly();
        bird2.makeSound();

        Bird bird3 = new Parrot("green", 100, "bird4");
        bird3.dance();
        bird3.fly();
        bird3.makeSound();
    }
}
