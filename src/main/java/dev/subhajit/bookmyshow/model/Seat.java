package dev.subhajit.bookmyshow.model;

import dev.subhajit.bookmyshow.model.Constant.SeatStatus;
import dev.subhajit.bookmyshow.model.Constant.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private int row;
    private int col;
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private SeatStatus status;

    public Seat() {
    }

    public Seat(int row, int col, String seatNumber, SeatType seatType, SeatStatus status) {
        this.row = row;
        this.col = col;
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.status = status;
    }
}
