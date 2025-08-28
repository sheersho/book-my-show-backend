package com.bookmyshow.bookmyshowaug25.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
    private int totalAmount;
    @ManyToMany
    private List<ShowSeat> bookedSeats;
    @OneToMany
    private List<Payment> payments;
    private BookingStatus status;
}

