package com.bookmyshow.backend.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity

public class Payment extends BaseModel{
    private Date date;
    private String refNumber;
    private PaymentStatus status;
    private PaymentMode paymentMode;
    private Booking booking;
}
