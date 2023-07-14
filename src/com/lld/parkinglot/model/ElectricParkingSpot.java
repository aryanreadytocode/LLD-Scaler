package com.lld.parkinglot.model;

public class ElectricParkingSpot extends ParkingSpot{

    private ElectricCharger electricCharger;

    public ElectricParkingSpot(ElectricCharger electricCharger) {
        this.electricCharger = electricCharger;
    }
}
