package ru.gb.elqueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;

@Component
public class InfBoard {

    private final Ticket ticket;
    private final TicketNumberGenerator ticketNumberGenerator;

    private enum enTarget {credit, card, deposit}

    @Autowired
    public InfBoard(Ticket ticket, TicketNumberGenerator ticketNumberGenerator) {
        this.ticket = ticket;
        this.ticketNumberGenerator = ticketNumberGenerator;
    }

    public Ticket newTicket() {
        ticket.setNumber(ticketNumberGenerator.createNewNumber());
        ticket.setCreatedAt(LocalDateTime.now());
        ticket.setVisitarget(enTarget.values()[new Random().nextInt(enTarget.values().length)].toString());
        return ticket;
    }
}
