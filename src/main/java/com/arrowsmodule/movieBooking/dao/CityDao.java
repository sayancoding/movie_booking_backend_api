package com.arrowsmodule.movieBooking.dao;

import com.arrowsmodule.movieBooking.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDao extends JpaRepository<City,Long> {
}
