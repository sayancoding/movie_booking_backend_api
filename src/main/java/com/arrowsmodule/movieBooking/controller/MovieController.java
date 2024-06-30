package com.arrowsmodule.movieBooking.controller;

import com.arrowsmodule.movieBooking.dto.MovieDto;
import com.arrowsmodule.movieBooking.dto.ResponseDto;
import com.arrowsmodule.movieBooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping
    public ResponseEntity<ResponseDto> post(@RequestBody
                                                MovieDto movieDto){
        ResponseEntity<ResponseDto> response;
        String res = movieService.post(movieDto);

        response = new ResponseEntity<>(ResponseDto.builder().data(res).build()
                ,HttpStatus.CREATED);

        return response;
    }

    @GetMapping
    public ResponseEntity<ResponseDto> findAll(){
        ResponseEntity<ResponseDto> response;
        List<MovieDto> movieDtos = movieService.getAllMovies();

        response = new ResponseEntity<>(ResponseDto.builder().data(movieDtos).build()
                ,HttpStatus.OK);

        return response;
    }
}
