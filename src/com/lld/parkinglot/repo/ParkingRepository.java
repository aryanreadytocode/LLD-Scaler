package com.lld.parkinglot.repo;

import com.lld.parkinglot.exception.ParkingLotAlreadyExistsException;
import com.lld.parkinglot.exception.ParkingLotNotAvailableException;
import com.lld.parkinglot.model.Gate;
import com.lld.parkinglot.model.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingRepository {

    private Map<String, ParkingLot> parkingLotMap;
    private Map<Gate, ParkingLot> gateParkingLotMap;

    public ParkingRepository() {
        this.parkingLotMap = new HashMap<>();
        this.gateParkingLotMap = new HashMap<>();
    }

    public ParkingLot save(ParkingLot parkingLot) throws Exception{
        if (parkingLotMap.containsKey(parkingLot.getId()))
            throw new ParkingLotAlreadyExistsException("Parking lot already exist");
        for (Gate gate: parkingLot.getGates())
            gateParkingLotMap.put(gate, parkingLot);
        return parkingLotMap.put(parkingLot.getId(), parkingLot);
    }

    public ParkingLot get(long parkingLotId) {
        return parkingLotMap.get(parkingLotId);
    }

    public ParkingLot update(ParkingLot parkingLot) {
        return parkingLotMap.put(parkingLot.getId(), parkingLot);
    }

    public ParkingLot getParkingLotFromGate(Gate gate) throws ParkingLotNotAvailableException{
        if (gateParkingLotMap.containsKey(gate)) {
            return gateParkingLotMap.get(gate);
        }else
            throw new ParkingLotNotAvailableException();
    }
}
