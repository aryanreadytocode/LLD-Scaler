package com.lld.designpattern.strategy;

public class WalkPathCalc implements PathCalcStrategy{

    private static WalkPathCalc instance;
    private WalkPathCalc() {

    }

    public static WalkPathCalc getInstance() {
        if (instance == null) {
            synchronized (WalkPathCalc.class){
                if (instance == null)
                    instance = new WalkPathCalc();
            }
        }
        return instance;
    }
    @Override
    public void findPath(String src, String des) {
        System.out.println("Path from source to destination using walk");
    }
}
