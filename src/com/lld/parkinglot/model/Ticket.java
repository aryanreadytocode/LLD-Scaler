package com.lld.parkinglot.model;

public class Ticket {

    private String entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Operator operator;
    private  EntryGate gate;

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public EntryGate getGate() {
        return gate;
    }

    public void setGate(EntryGate gate) {
        this.gate = gate;
    }
}

