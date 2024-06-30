package com.arrowsmodule.movieBooking.service;

import com.arrowsmodule.movieBooking.dto.MovieDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MovieService {
    public String post(MovieDto movie);
    public List<MovieDto> getAllMovies();
}
