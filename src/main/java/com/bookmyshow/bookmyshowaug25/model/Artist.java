package com.bookmyshow.bookmyshowaug25.model;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Artist extends BaseModel{
    private String name;
}
