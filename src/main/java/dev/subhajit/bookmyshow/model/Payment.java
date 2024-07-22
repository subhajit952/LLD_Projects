package dev.subhajit.bookmyshow.model;

import dev.subhajit.bookmyshow.model.Constant.PaymentMode;
import dev.subhajit.bookmyshow.model.Constant.PaymentStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class Payment extends BaseModel{
    private LocalDateTime paymentTime;
    private double amount;
    private String referenceId;

    @ManyToOne
    private Ticket tickets;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

}
