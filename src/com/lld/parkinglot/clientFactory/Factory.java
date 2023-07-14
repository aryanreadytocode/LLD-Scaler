package com.lld.parkinglot.clientFactory;

import com.lld.parkinglot.dto.ResponseDTO;
import com.lld.parkinglot.model.*;
import com.lld.parkinglot.repo.ParkingRepository;

import java.util.ArrayList;
import java.util.List;

public class Factory {


    public void createAndSaveParkingLot(int size, String initials) throws Exception {
        int i = 0;
        ParkingRepository repository = new ParkingRepository();
        while (i < size) {
            List<ParkingFloor> parkingFloors = createParkingFloor(2, initials);
            List<Gate> gates = createGate(4, initials);
            ParkingLot parkingLot = new ParkingLot("Address " + initials + i, parkingFloors, gates, true, false);
            repository.save(parkingLot);
            i++;
        }

    }

    public List<ParkingFloor> createParkingFloor(int size, String initials) {
        List<ParkingFloor> parkingFloors = new ArrayList<>();
        int i = 0;
        while (i < size) {
            List<ParkingSpot> parkingSpots = createParkingSpot(5, "KN");
            ParkingFloor floor = new ParkingFloor(parkingSpots, i + 1, false);
            parkingFloors.add(floor);
            i++;
        }
        return parkingFloors;
    }

    public List<ParkingSpot> createParkingSpot(int size, String initials) {
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        int i = 0;
        while (i < size) {
            ParkingSpot spot = new ParkingSpot(initials + "_" + i, SpotType.LARGE, ParkingSpotStatus.AVAILABLE, new Vehicle("CAR_" + i, VehicleType.LARGE));
            parkingSpots.add(spot);
            i++;
        }
        return parkingSpots;
    }

    public List<Gate> createGate(int size, String initials) {
        int i = 0;
        List<Gate> gates = new ArrayList<>();
        while (i < size / 2) {
            Gate gate = new EntryGate(new DisplayBoard());
            gate.setGateType(GateType.ENTRY);
            gate.setNumber(i + 1);
            gate.setId(initials + gate + i + 1);
            gate.setOperator(new Operator("Operator_" + (i + 1)));
            gates.add(gate);
            i++;
        }
        i = 0;
        while (i < size / 2) {
            Gate gate = new ExitGate();
            gate.setId(initials + gate + i + 1);
            gate.setGateType(GateType.EXIT);
            gate.setNumber(i + 1);
            gate.setOperator(new Operator("Operator_" + (i + 3)));
            gates.add(gate);
            i++;
        }
        return gates;
    }
}
