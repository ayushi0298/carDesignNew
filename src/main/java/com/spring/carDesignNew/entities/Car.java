package com.spring.carDesignNew.entities;

import java.util.ArrayList;


public class Car {
	String id;
	public boolean isEngineOn;
	public ArrayList<Door> doors = new ArrayList<>(4);

	public Car(String id) {
		this.id=id;
		for (int i = 0; i < 4; i++) {
			doors.add(new Door());
		}
	}
	public boolean isEngineOn() {
		return isEngineOn;
	}


}
