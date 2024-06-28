package com.arrowsmodule.movieBooking.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Booking {
    private long bookingId;
    private String status;
    private List<Seat> seats;
    private LocalDateTime timeStamp;
    private Show show;
    private User user;
}
