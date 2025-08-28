package com.bookmyshow.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity

public class Theatre extends BaseModel {
    private String name;
    private String address;
    private  List<Screen> screens;
    private Region region;
}
