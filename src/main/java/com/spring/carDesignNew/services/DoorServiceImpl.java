package com.spring.carDesignNew.services;

import org.springframework.stereotype.Service;

import com.spring.carDesignNew.entities.Door;

@Service
public class DoorServiceImpl implements DoorService {

	String result;
    Door door1= new Door();
	@Override
	public String doorOpen(int doornumber) {
		
		
			if(doornumber<=4) {
				if(!door1.isDoorOpen()) {
					door1.isDoorOpen=true;
					result="yes";
				}
				else {
					result="no";
				}
			}
			else {
				result="car has only 4 doors";
			}
		
		return result;
	}

	@Override
	public String closeDoor() {
		// TODO Auto-generated method stub
		return null;
	}
	public String hi() {
		// TODO Auto-generated method stub
		return "hey";
	}


}
