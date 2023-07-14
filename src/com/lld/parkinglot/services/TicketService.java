package com.lld.parkinglot.services;

import com.lld.parkinglot.exception.ParkingLotNotAvailableException;
import com.lld.parkinglot.exception.ParkingSpotNotAvailable;
import com.lld.parkinglot.model.*;
import com.lld.parkinglot.repo.ParkingRepository;
import com.lld.parkinglot.strategies.spotFindingStrategy.ParkingSpotFindingStrategy;
import com.lld.parkinglot.strategies.spotFindingStrategy.RandomParkingSpotFindingStrategy;

import java.util.Date;

public class TicketService {

    private ParkingSpotFindingStrategy parkingSpotFindingStrategy;
    private ParkingRepository repository;

    public TicketService(ParkingSpotFindingStrategy parkingSpotFindingStrategy, ParkingRepository repository) {
        this.parkingSpotFindingStrategy = parkingSpotFindingStrategy;
        this.repository = repository;
    }

    public Ticket getTicket(Vehicle vehicle, EntryGate entryGate) throws ParkingLotNotAvailableException, ParkingSpotNotAvailable {
        ParkingSpot availableSpot = parkingSpotFindingStrategy.getAvailableSpot(vehicle.getVehicleType(),
                repository.getParkingLotFromGate(entryGate));
        Ticket ticket = new Ticket();
        ticket.setGate(entryGate);
        ticket.setEntryTime(new Date().toString());
        ticket.setOperator(entryGate.getOperator());
        ticket.setParkingSpot(availableSpot);
        ticket.setVehicle(vehicle);
        return ticket;
    }

    /*
    * Steps:
    * 1. Find available Spot
    * 2. Generate ticket object
    * 3. Add the details in ticket object
    * 4. sava and return*/

    public void updateParkingSpotStatus(ParkingLot parkingLot, ParkingSpot parkingSpot) {
        for (ParkingFloor floor: parkingLot.getParkingFloors()) {
            for (ParkingSpot spot: floor.getParkingSpots()) {
                if (spot.equals(parkingSpot)) {
                    if (parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)) {
                        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
                    } else {
                        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
                    }
                }
            }
        }
        repository.update(parkingLot);
    }
}
