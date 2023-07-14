package com.lld.parkinglot;

import com.lld.parkinglot.clientFactory.Factory;
import com.lld.parkinglot.controller.TicketController;
import com.lld.parkinglot.model.*;
import com.lld.parkinglot.repo.ParkingRepository;
import com.lld.parkinglot.services.ParkingSpotVehicleTypeMatchingService;
import com.lld.parkinglot.services.TicketService;
import com.lld.parkinglot.strategies.spotFindingStrategy.RandomParkingSpotFindingStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    /*Todo
     *  1. Generate 10 parking spots
     *  2. Create 2 floors of 5 spots each
     *  3. Using the spots create the floor, and using the floors create the parkinglot
     *  4. Generate Ticket*/
    public static void main(String[] args) throws Exception {
        new Factory().createAndSaveParkingLot(2, "Patna");
        TicketController controller = new TicketController(new TicketService(new RandomParkingSpotFindingStrategy(new ParkingSpotVehicleTypeMatchingService())))
    }
}
