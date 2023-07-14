package com.lld.parkinglot.model;

import java.util.List;

public class ParkingFloor extends BaseModel{

    private List<ParkingSpot> parkingSpots;

    private int floorNumber;

    public boolean isFull() {
        return isFull;
    }

    public ParkingFloor(List<ParkingSpot> parkingSpots, int floorNumber, boolean isFull) {
        this.parkingSpots = parkingSpots;
        this.floorNumber = floorNumber;
        this.isFull = isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    private boolean isFull;

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
