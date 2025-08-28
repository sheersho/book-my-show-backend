package com.bookmyshow.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private  String name;
    private  int rowNumbers;
    private  int columnNumber;
    @ManyToOne
    private SeatType seatType;
}
