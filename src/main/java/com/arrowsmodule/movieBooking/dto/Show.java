package com.arrowsmodule.movieBooking.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class Show {
    private long showId;
    private LocalDate showDate;
    private LocalTime startAt;
    private LocalTime endAt;
    private MovieDto movie;
    private CinemaHall cinemaHall;
}
