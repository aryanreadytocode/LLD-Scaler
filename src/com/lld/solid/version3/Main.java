package com.lld.solid.version3;

public class Main {

    public static void main(String[] args) {
        Peacock bird = new Peacock("Modi Ji ka mor", "multi-color", 5000);
        bird.sound();
        bird.dance();
        bird.breath();

        Penguin bird1 = new Penguin("Aalsi penguin", "Black&White", 25000);
        bird1.sound();
        bird1.dance();

        Sparrow bird2 = new Sparrow("Khudbuddi chiddaiya", "Grey", 50);
        bird2.fly();
        bird2.dance();
        bird2.sound();
    }
}
