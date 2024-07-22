package dev.subhajit.bookmyshow.model;

import dev.subhajit.bookmyshow.model.Constant.TicketStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    private LocalDateTime timeOffBooking;
    private double totalAmount;

    @OneToMany
    private List<ShowSeat> showSeats;
    @OneToMany
    private Show shows;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

}
