package com.lld.parkinglot.controller;

import com.lld.parkinglot.dto.ErrorResponseDTO;
import com.lld.parkinglot.dto.GenerateTicketRequestDTO;
import com.lld.parkinglot.dto.GenerateTicketResponseDTO;
import com.lld.parkinglot.dto.ResponseDTO;
import com.lld.parkinglot.exception.ParkingLotNotAvailableException;
import com.lld.parkinglot.exception.ParkingSpotNotAvailable;
import com.lld.parkinglot.model.Ticket;
import com.lld.parkinglot.services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public ResponseDTO getTicket(GenerateTicketRequestDTO generateTicketRequestDTO) {

       Ticket ticket;
        try {
            ticket = ticketService.getTicket(generateTicketRequestDTO.getVehicle(),
                    generateTicketRequestDTO.getEntryGate());
            return new GenerateTicketResponseDTO(ticket);
        } catch (ParkingLotNotAvailableException p) {
            return new ErrorResponseDTO("Parking lot not Available", 404);
        } catch (ParkingSpotNotAvailable s) {
            return new ErrorResponseDTO("Parking Spot not available", 404);
        }
    }


}
