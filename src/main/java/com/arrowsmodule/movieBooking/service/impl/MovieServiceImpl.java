package com.arrowsmodule.movieBooking.service.impl;

import com.arrowsmodule.movieBooking.dao.MovieDao;
import com.arrowsmodule.movieBooking.entity.Movie;
import com.arrowsmodule.movieBooking.dto.MovieDto;
import com.arrowsmodule.movieBooking.service.MovieService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieDao movieDao;
    @Override
    public String post(MovieDto movieDto) {
        Movie movie = new Movie();
        BeanUtils.copyProperties(movieDto,movie, "movieId");
        movieDao.save(movie);
        return "New Movie has been posted";
    }

    @Override
    public List<MovieDto> getAllMovies() {
        List<Movie> movies = movieDao.findAll();

        List<MovieDto> movieDtos = movies.stream().map(el->{
            MovieDto movieDto = new MovieDto();
            BeanUtils.copyProperties(el,movieDto);
            return movieDto;
        }).collect(Collectors.toList());

        return movieDtos;
    }
}
