package com.arrowsmodule.movieBooking.entity;

import lombok.Data;

@Data
public class ShowSeat {
    private long showSeatId;
    private String status;
    private long price;
    private Seat seat;
    private Show show;
}
