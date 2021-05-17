package com.spring.carDesignNew.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.carDesignNew.services.CarService;
import com.spring.carDesignNew.services.DoorService;


	@RestController
	public class Controller {
		
		@Autowired
		public CarService carservice;
		@Autowired
		public DoorService doorService;
		
	
	    @GetMapping("/startCar")
		public  String  startCar() {
			
			return this.carservice.startCar();
			
		}
	    
	    @GetMapping("/stopCar")
	   	public  String  closeCar() {
	   		
	   		return this.carservice.closeCar();
	   		
	   	}
	    @GetMapping("/hi")
	   	public  String hi() {
	    	return  this.doorService.hi();
	    	
	    }
	    	
	   		
	    @GetMapping("/openDoor")
	   	public  String openDoor() {
	    	
	   		return this.doorService.doorOpen(3);
	   		
	   	}
	    
	
	}
