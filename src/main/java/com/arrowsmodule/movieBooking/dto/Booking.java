package com.arrowsmodule.movieBooking.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

//@EqualsAndHashCode(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class Booking extends Metadata {

    private long bookingId;
    private String status;
    private Set<ShowSeat> showSeats = new HashSet<>();
    private LocalDateTime timeStamp;
    private Show show;
    private User user;
}
