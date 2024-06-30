package com.arrowsmodule.movieBooking.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShowSeat {
    private long showSeatId;
    private String status;
    private long price;
    private Seat seat;
    private Show show;
//    private Booking booking;
}
