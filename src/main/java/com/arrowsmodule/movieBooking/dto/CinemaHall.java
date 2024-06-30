package com.arrowsmodule.movieBooking.dto;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CinemaHall {
    private long cinemaHallId;
    private String name;
    private City city;
    private long totalSeat;
}
