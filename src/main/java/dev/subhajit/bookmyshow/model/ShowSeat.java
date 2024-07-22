package dev.subhajit.bookmyshow.model;

import dev.subhajit.bookmyshow.model.Constant.ShowSeatStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    private int price;

    @ManyToOne
    private Show shows;
    @ManyToOne
    private Seat seats;

    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;
    public ShowSeat() {
    }

    public ShowSeat(int price, Show shows, Seat seats, ShowSeatStatus showSeatStatus) {
        this.price = price;
        this.shows = shows;
        this.seats = seats;
        this.showSeatStatus = showSeatStatus;
    }


}

