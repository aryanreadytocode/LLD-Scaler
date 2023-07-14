package com.lld.parkinglot.model;

public class ParkingSpot extends BaseModel{

    protected String spotNumber;
    private SpotType spotType;
    private ParkingSpotStatus parkingSpotStatus;
    private Vehicle vehicleNo;

    public ParkingSpot(String spotNumber, SpotType spotType, ParkingSpotStatus parkingSpotStatus, Vehicle vehicleNo) {
        this.spotNumber = spotNumber;
        this.spotType = spotType;
        this.parkingSpotStatus = parkingSpotStatus;
        this.vehicleNo = vehicleNo;
    }

    public Vehicle getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(Vehicle vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(String spotNumber) {
        this.spotNumber = spotNumber;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }
}
