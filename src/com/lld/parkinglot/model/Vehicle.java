package com.lld.parkinglot.model;

public class Vehicle extends BaseModel{

    private String name;
    private VehicleType vehicleType;

    public Vehicle(String name, VehicleType vehicleType) {
        this.name = name;
        this.vehicleType = vehicleType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
