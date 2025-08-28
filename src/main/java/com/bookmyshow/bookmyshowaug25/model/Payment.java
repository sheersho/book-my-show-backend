package com.bookmyshow.bookmyshowaug25.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private Date date;
    private int amount;
    private String refNumber;
    @Enumerated
    private PaymentStatus status;
    private PaymentMode paymentMode;
    @ManyToOne
    private Booking booking;
}
