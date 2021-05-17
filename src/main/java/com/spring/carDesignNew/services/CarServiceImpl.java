package com.spring.carDesignNew.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.carDesignNew.entities.Car;
import com.spring.carDesignNew.entities.Door;


@Service
public class CarServiceImpl implements CarService {

	
	String result;
	Car car1= new Car(123);


	@Override
	public String closeCar() {
		
		if(car1.isEngineOn()) {
			car1.isEngineOn=false;
			result= "Close car";
		}
		else {
			result= "car already closed";
		}
		return result;
	}

	@Override
	public String hi() {
		
		return "hello";
	}

	@Override
	public String startCar() {
		
		if(!car1.isEngineOn()) {
			car1.isEngineOn=true;
			result= "Open car";
		}
		else {
			result= "car already opened";
		}
		return result;
	}


	/*@Override
	public String openDoor(int doorNumber) {
		System.out.print(doorNumber);
        return this.doorservice.doorOpen();
	}*/


}
