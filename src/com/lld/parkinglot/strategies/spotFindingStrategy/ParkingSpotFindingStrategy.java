package com.lld.parkinglot.strategies.spotFindingStrategy;

import com.lld.parkinglot.exception.ParkingSpotNotAvailable;
import com.lld.parkinglot.model.ParkingLot;
import com.lld.parkinglot.model.ParkingSpot;
import com.lld.parkinglot.model.VehicleType;

public interface ParkingSpotFindingStrategy {
    ParkingSpot getAvailableSpot(VehicleType vehicleType, ParkingLot parkingLot) throws ParkingSpotNotAvailable;

}
