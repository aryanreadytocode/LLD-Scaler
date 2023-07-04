package com.lld.designpattern.decorator;

public class Client {

    public static void main(String[] args) {
        IceCream iceCream = new VanillaCone(new ChocoChips(new ChocolateScoop(new OrangeCone())));
        int cost = iceCream.getCost();
        String description = iceCream.getDescription();

        System.out.println("Ice cream cost: "+cost);
        System.out.println("Ice cream desc: "+description);

    }
}
