package com.lld.parkinglot.strategies.spotFindingStrategy;

import com.lld.parkinglot.exception.ParkingSpotNotAvailable;
import com.lld.parkinglot.model.*;
import com.lld.parkinglot.services.ParkingSpotVehicleTypeMatchingService;

public class RandomParkingSpotFindingStrategy implements ParkingSpotFindingStrategy{

    private ParkingSpotVehicleTypeMatchingService parkingSpotVehicleTypeMatchingService;

    public RandomParkingSpotFindingStrategy(ParkingSpotVehicleTypeMatchingService parkingSpotVehicleTypeMatchingService) {
        this.parkingSpotVehicleTypeMatchingService = parkingSpotVehicleTypeMatchingService;
    }

    @Override
    public ParkingSpot getAvailableSpot(VehicleType vehicleType, ParkingLot parkingLot) throws ParkingSpotNotAvailable {
        for (ParkingFloor floor: parkingLot.getParkingFloors()) {
            for (ParkingSpot spot: floor.getParkingSpots()) {
                if (spot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE) &&
                parkingSpotVehicleTypeMatchingService.matches(spot.getSpotType(), vehicleType))
                    return spot;
            }
        }
        throw new ParkingSpotNotAvailable();
    }
}
