package com.arrowsmodule.movieBooking.entity;

import lombok.Data;

@Data
public class CinemaHall {
    private long cinemaHallId;
    private String name;
    private Address address;
    private long totalSeat;
}
