package com.lld.parkinglot.model;

import java.util.List;

public class ParkingLot extends BaseModel{

    private String address;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private boolean isSpotAvailable;
    private boolean isFull;

    public ParkingLot(String address, List<ParkingFloor> parkingFloors, List<Gate> gates, boolean isSpotAvailable, boolean isFull) {
        this.address = address;
        this.parkingFloors = parkingFloors;
        this.gates = gates;
        this.isSpotAvailable = isSpotAvailable;
        this.isFull = isFull;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public boolean isSpotAvailable() {
        return isSpotAvailable;
    }

    public void setSpotAvailable(boolean spotAvailable) {
        isSpotAvailable = spotAvailable;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }
}
