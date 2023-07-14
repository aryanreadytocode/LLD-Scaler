package com.lld.parkinglot.services;

import com.lld.parkinglot.model.SpotType;
import com.lld.parkinglot.model.VehicleType;

public class ParkingSpotVehicleTypeMatchingService {

    public boolean matches(SpotType spotType, VehicleType vehicleType) {
        if (spotType.equals(SpotType.LARGE) && vehicleType.equals(VehicleType.LARGE)) {
            return true;
        } else if (spotType.equals(SpotType.MEDIUM) && vehicleType.equals(VehicleType.MEDIUM)) {
            return true;
        } else if (spotType.equals(SpotType.SMALL) && vehicleType.equals(VehicleType.SMALL)) {
            return true;
        } else return spotType.equals(SpotType.ELECTRIC) && vehicleType.equals(VehicleType.ELECTRIC);
    }
}
