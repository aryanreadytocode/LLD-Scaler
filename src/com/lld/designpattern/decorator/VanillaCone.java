package com.lld.designpattern.decorator;

public class VanillaCone implements IceCream{
    private IceCream iceCream;

    public VanillaCone() {
    }

    public VanillaCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if (iceCream!= null)
            return iceCream.getCost()+10;
        return 10;
    }

    @Override
    public String getDescription() {
        if (iceCream!= null)
            return iceCream.getDescription()+" Vanilla Cone";
        return "Vanilla Cone";
    }
}
