package com.arrowsmodule.movieBooking.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "t_show")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long showId;
    private LocalDate showDate;
    private LocalTime startAt;
    private LocalTime endAt;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "movie_id",referencedColumnName = "movieId")
    private Movie movie;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cinema_hall_id",referencedColumnName = "cinemaHallId")
    private CinemaHall cinemaHall;
}
