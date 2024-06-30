package com.arrowsmodule.movieBooking.dao;

import com.arrowsmodule.movieBooking.entity.CinemaHall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaHallDao extends JpaRepository<CinemaHall,Long> {
}
