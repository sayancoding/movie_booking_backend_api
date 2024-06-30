package com.arrowsmodule.movieBooking.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "t_seat")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long seatId;
    private long seatNumber;
    private String type;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cinema_hall_id",referencedColumnName = "cinemaHallId")
    private CinemaHall cinemaHall;
}
