package com.lld.parkinglot.dto;

import com.lld.parkinglot.model.Ticket;

public class GenerateTicketResponseDTO extends ResponseDTO{

    private Ticket ticket;

    public GenerateTicketResponseDTO() {
    }

    public GenerateTicketResponseDTO(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
