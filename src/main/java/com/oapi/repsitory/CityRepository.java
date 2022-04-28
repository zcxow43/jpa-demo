package com.oapi.repsitory;

import com.oapi.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CityRepository extends JpaRepository<City,Long> {

}