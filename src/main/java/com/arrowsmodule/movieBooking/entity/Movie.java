package com.arrowsmodule.movieBooking.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "t_movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long movieId;

    private String name;
    private String description;
    private long durationInMin;
    private String language;
    private LocalDate releasedAt;
    private String genre;
}
