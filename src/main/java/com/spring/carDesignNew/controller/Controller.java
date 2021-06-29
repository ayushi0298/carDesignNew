package com.spring.carDesignNew.controller;

import com.spring.carDesignNew.entities.Car;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.spring.carDesignNew.services.CarService;

@RestController
public class Controller {

    @Autowired
    public  CarService carservice;

    @GetMapping("/car")
    public String startCar() {

        return this.carservice.startCar();

    }

    @GetMapping("/stopCar")
    public String closeCar() {

        return this.carservice.closeCar();

    }

    @GetMapping("/openDoor")
    public String openDoor() {

        return this.carservice.openDoor(3);

    }

    @GetMapping("/closeDoor")
    public String closeDoor() {

        return this.carservice.closeDoor(2);

    }


}
