package com.bookmyshow.backend.controller;

import com.bookmyshow.backend.dto.BookTicketRequest;
import com.bookmyshow.backend.dto.BookTicketResponse;

public class BookingController {
    public BookTicketResponse void bookTicket(BookTicketRequest){
        BookTicketResponse bookTicketResponse = new BookTicketResponse();

        try{
            bookingService.bookTicket(
                    request.getShowId(),
                    request.getUserId(),
                    request.getShowSeats()
            );
            response.setBookingId(booking.getId());
            response.setStatus(Response.Status.SUCCESS);
            resposne.setMessage("Booking Confirmed Please make payment")
        }
        catch(Exception e){
            response.setStatus(Response.Status.FAILURE);
            resposne.setMessage("Booking Failed + Excpetion Message")
        }
    }
}
