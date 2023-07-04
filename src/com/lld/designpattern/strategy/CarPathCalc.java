package com.lld.designpattern.strategy;

public class CarPathCalc implements PathCalcStrategy{
    private static CarPathCalc instance;

    public static CarPathCalc getInstance() {
        if (instance == null){
            synchronized (CarPathCalc.class) {
                if (instance == null)
                    instance = new CarPathCalc();
            }
        }
        return instance;
    }
    private CarPathCalc() {

    }
    @Override
    public void findPath(String src, String des) {
        System.out.println("Path from source to destination using car");
    }
}
