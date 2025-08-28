package com.bookmyshow.bookmyshowaug25.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private String name;
    private int seatRow;
    private int seatColumn;
    @ManyToOne
    private SeatType seatType;
}
