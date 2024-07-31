package com.ak.app.ak;

import com.ak.app.ak.apps.CarApp;
import com.ak.app.ak.models.Car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class AkDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AkDemoAppApplication.class, args);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CarApp.class);
		Car bean = applicationContext.getBean(Car.class);
		bean.startCar();


	}

}
