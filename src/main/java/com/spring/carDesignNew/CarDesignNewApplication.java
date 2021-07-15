package com.spring.carDesignNew;

import com.spring.carDesignNew.controller.Controller;
import com.spring.carDesignNew.entities.Car;
import com.spring.carDesignNew.entities.Door;
import com.spring.carDesignNew.services.CarService;
import com.spring.carDesignNew.services.CarServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.spring.carDesignNew.services","com.spring.carDesignNew.controller"})
@EntityScan("com.spring.carDesignNew.entities")
public class CarDesignNewApplication {

	public static void main(String[] args) {
		//CarServiceImpl carService= new CarServiceImpl("A111");
		//System.out.println(carService.getCar().start());


		SpringApplication.run(CarDesignNewApplication.class, args);


	}

}
