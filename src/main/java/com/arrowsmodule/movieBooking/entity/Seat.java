package com.arrowsmodule.movieBooking.entity;

import lombok.Data;

@Data
public class Seat {
    private long seatId;
    private long seatNumber;
    private String type;
    private CinemaHall cinemaHall;
}
