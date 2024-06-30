package com.arrowsmodule.movieBooking.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class City {
    private long cityId;
    private String name;
    private String state;
    private String zipcode;

}
