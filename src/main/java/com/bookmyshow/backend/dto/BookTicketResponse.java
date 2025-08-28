package com.bookmyshow.backend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTicketResponse {
    private Long bookingId;
    private  ResponseStatus status;;
}
