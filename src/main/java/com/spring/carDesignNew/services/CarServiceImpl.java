package com.spring.carDesignNew.services;

import org.springframework.stereotype.Service;

import com.spring.carDesignNew.entities.Car;

import java.util.ArrayList;


@Service
public class CarServiceImpl implements CarService {


	String result;
	ArrayList<String> cars=new ArrayList<>();
	Car car = new Car();



	@Override
	public String start(String str) {
		if(!cars.contains(str)){
			cars.add(str);
			car.start(str);

			result= "started " + str;

		}
		else {
			result= "Already started: "+ str;
		}
		return result;
	}
}
