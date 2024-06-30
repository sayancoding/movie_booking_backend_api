package com.arrowsmodule.movieBooking.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovieDto {
    private long movieId;
    private String name;
    private String description;
    private long durationInMin;
    private String language;
    private LocalDate releasedAt;
    private String genre;
}
