package com.arrowsmodule.movieBooking.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Seat {
    private long seatId;
    private long seatNumber;
    private String type;
    private CinemaHall cinemaHall;
}
