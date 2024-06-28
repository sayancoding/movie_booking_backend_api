package com.arrowsmodule.movieBooking.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class Show {
    private long showId;
    private LocalDate showDate;
    private LocalTime startAt;
    private LocalTime endAt;
    private Movie movie;
    private CinemaHall cinemaHall;
}
