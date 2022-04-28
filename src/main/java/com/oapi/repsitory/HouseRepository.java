package com.oapi.repsitory;

import com.oapi.entity.House;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HouseRepository extends JpaRepository<House,Long> {

}