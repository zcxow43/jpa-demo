package com.oapi.repsitory;

import com.oapi.entity.Human;
import com.oapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface HumanRepository extends JpaRepository<Human,Long> {

    @Query("SELECT u FROM User u WHERE userName = :userName")
    List<User> findAllByUserName(@Param("userName") String userName);
}