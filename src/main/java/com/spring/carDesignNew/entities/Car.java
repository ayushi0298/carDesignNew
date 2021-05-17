package com.spring.carDesignNew.entities;

import java.util.ArrayList;


public class Car {
	int id;
	public boolean isEngineOn;
	public ArrayList<Door> doors = new ArrayList<>(4);
	public ArrayList<Door> getDoors() {
		return doors;
	}
	public void setDoors(ArrayList<Door> doors) {
		this.doors = doors;
	}
	public Car(int id) {
		super();
		this.id = id;
		for (int i = 0; i < 4; i++) {
            doors.add(new Door());
        }
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", isEngineOn=" + isEngineOn + ", getId()=" + getId() + ", isEngineOn()="
				+ isEngineOn() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isEngineOn() {
		return isEngineOn;
	}
	public void setEngineOn(boolean isEngineOn) {
		this.isEngineOn = isEngineOn;
	}

}
