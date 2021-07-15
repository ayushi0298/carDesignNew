package com.spring.carDesignNew.controller;

import com.spring.carDesignNew.model.CarRequest;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.spring.carDesignNew.services.CarService;

@RestController
public class Controller {

    @Autowired
    public CarService carservice;

    /*
    id: 1
    */

    @PostMapping("/create")
    public String closeCar(@RequestBody CarRequest carRequest) {
        return carservice.start(carRequest.getId());

    }
}



