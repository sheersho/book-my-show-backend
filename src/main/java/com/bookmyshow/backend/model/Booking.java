package com.bookmyshow.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    private Date bookingDate;
    private int noOfSeats;
    @ManyToOne
    private User bookedBy;
    private  int totalAmount;
    @OneToMany
    private List<ShowSeat> bookedSeats;
    private List<Payment> payments;
    private BookingStatus
}

