package com.spring.carDesignNew.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.carDesignNew.entities.Car;
import com.spring.carDesignNew.entities.Door;

import java.util.ArrayList;


@Service
public class CarServiceImpl implements CarService {

	
	String result;
	Car car1= new Car("A11");
	@Override
	public String closeCar() {
		
		if(car1.isEngineOn()) {
			car1.isEngineOn=false;
			result= "Close the car";
		}
		else {
			result= "Car is already closed";
		}
		return result;
	}

	@Override
	public String start() {
		if(car1.isEngineOn()){
			car1.isEngineOn= false;
			result="hi";
		}
		return result;
	}


	@Override
	public String startCar() {
		
		if(!car1.isEngineOn()) {
			car1.isEngineOn=true;
			result= "Open the car";
		}
		else {
			result= "Car is already opened";
		}
		return result;
	}

	@Override
	public String openDoor(int doornumber) {
		Door door= car1.doors.get(doornumber);
		if(!door.isDoorOpen){
			door.isDoorOpen=true;
			result="Open the door : "+ doornumber;
		}
		else{
			result= "Door " + doornumber + " already opened";
		}
		return result;
	}

	@Override
	public String closeDoor(int doornumber) {
		Door door= car1.doors.get(doornumber);
		if(door.isDoorOpen){
			door.isDoorOpen=false;
			result="Close the door : "+ doornumber;
		}
		else{
			result= "Door " + doornumber + " already closed";
		}
		return result;
	}


}
