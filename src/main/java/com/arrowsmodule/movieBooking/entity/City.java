package com.arrowsmodule.movieBooking.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "t_city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cityId;
    private String name;
    private String state;
    private String zipcode;

}
