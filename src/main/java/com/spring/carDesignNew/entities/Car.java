package com.spring.carDesignNew.entities;

import java.util.ArrayList;


public class Car {
	public String id;
	public boolean isEngineOn;
	public ArrayList<Door> doors = new ArrayList<>(4);
	String result;


	public Car(String id) {
		this.id=id;
		for (int i = 0; i < 4; i++) {
			doors.add(new Door());
		}
	}

	public Car() {

	}

	public String getId() {
		return id;
	}

	public boolean isEngineOn() {
		return isEngineOn;
	}

	public void start(String str) {

		if(!isEngineOn()) {
			isEngineOn=true;
			//result= "Open the car";
		}
		else {
			//result= "Car is already opened";
		}
	}
	public String closeCar() {

		if(isEngineOn()) {
			isEngineOn=false;
			result= "Close the car";
		}
		else {
			result= "Car is already closed";
		}
		return result;
	}
}
