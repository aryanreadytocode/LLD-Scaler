package com.lld.designpattern.strategy;

public class Client {
    public static void main(String[] args) {
        Maps maps = new Maps();
        maps.findPath("Patna", "Delhi", "CAR");
        maps.findPath("Patna", "Delhi", "BIKE");
    }
}
