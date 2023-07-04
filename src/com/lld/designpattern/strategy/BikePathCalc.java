package com.lld.designpattern.strategy;

public class BikePathCalc implements PathCalcStrategy{

    private BikePathCalc() {
    }

    private static BikePathCalc instance;

    public static BikePathCalc getInstance() {
        if (instance == null) {
            synchronized (BikePathCalc.class) {
                if (instance == null)
                    instance = new BikePathCalc();
            }
        }
        return instance;
    }

    @Override
    public void findPath(String src, String des) {
        System.out.println("Path from source to destination using bike");
    }
}
