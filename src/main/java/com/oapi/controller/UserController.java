package com.oapi.controller;

import com.oapi.entity.House;
import com.oapi.entity.Human;
import com.oapi.entity.User;
import com.oapi.repsitory.CityRepository;
import com.oapi.repsitory.HouseRepository;
import com.oapi.repsitory.HumanRepository;
import com.oapi.repsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private HumanRepository humanRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private HouseRepository houseRepository;

    @GetMapping(value = "/init")
    public void init(){
//        City city = new City("a1","a2");
//        cityRepository.save(city);

//        House house = new House("b1","b2");
//        houseRepository.save(house);

        Human user = new Human("a1", "a2");
        humanRepository.save(user);

    }

    @GetMapping(value = "/saveHuman")
    public void saveHuman(String name,String sex){
        Human user = new Human(name, sex);
        humanRepository.save(user);
    }

    @GetMapping(value = "/getHuman")
    public List<Human> getHuman(){
        return humanRepository.findAll();
    }

    //http://localhost:8080/saveUser?userName=%E5%A4%A7%E8%80%81%E6%9D%A8&userPassword=123
    @GetMapping(value = "/saveUser")
    public void saveUser(String userName,String userPassword){
        User user = new User(userName, userPassword);
        userRepository.save(user);
    }

    //http://localhost:8080/updateUser?Id=1&userName=%E5%A4%A7%E8%80%81%E6%9D%A8&userPassword=1111
    @GetMapping(value = "/updateUser")
    public void updateUser(Long Id,String userName,String userPassword){
        User user = new User(Id,userName, userPassword);
        userRepository.save(user);
    }

    //http://localhost:8080/deleteUser?Id=1
    @GetMapping(value = "/deleteUser")
    public void deleteUser(Long Id){
        userRepository.deleteById(Id);
    }

    //http://localhost:8080/getUserById?Id=1
    @GetMapping(value = "/getUserById")
    public Optional<User> getUserById(Long Id){
        return userRepository.findById(Id);
    }

    //http://localhost:8080/getUserByUserName?userName=dalaoyang
    @GetMapping(value = "/getUserByUserName")
    public List<User> getUserByUserName(String userName){
        return userRepository.findAllByUserName(userName);
    }
}