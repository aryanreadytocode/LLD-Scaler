package com.lld.designpattern.strategy;

public class PathCalculatorFactory {

    public static PathCalcStrategy getPathCalculator(String mode) {
        if (mode.equals("CAR")) {
            return CarPathCalc.getInstance();
        }else if (mode.equals("BIKE")) {
            return BikePathCalc.getInstance();
        }else
            return WalkPathCalc.getInstance();
    }
}
