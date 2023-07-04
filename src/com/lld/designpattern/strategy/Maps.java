package com.lld.designpattern.strategy;

public class Maps {

    public void findPath(String src, String des, String mode) {
        PathCalcStrategy pathCalcStrategy = PathCalculatorFactory.getPathCalculator(mode);
        pathCalcStrategy.findPath(src, des);
    }
}
