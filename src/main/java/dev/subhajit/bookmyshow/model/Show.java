package dev.subhajit.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @ManyToOne
    private Movie movies;
    @ManyToOne
    private Auditorium auditorium;
    @ManyToOne
    private List<ShowSeat> showSeats;

}
