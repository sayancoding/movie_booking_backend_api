package com.arrowsmodule.movieBooking.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Movie {
    private long movieId;
    private String name;
    private String desc;
    private long durationInMin;
    private String language;
    private LocalDate releaseAt;
    private String genre;
}
