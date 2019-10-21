package com.Cars;

import java.util.Iterator;

public class Car_Developed extends Car_Features{
	
	public static void main(String[] args) {
		Car_Features cf = new Car_Features();
		car_Brand(" Honda");
		cf.carEngines(" 12 V ");
		cf.carTransmission(" Automatic");
		cf.carDoors( 4);
		cf.carColores(" Blue");
		cf.carSunroof(false);
		cf.carMoonroof(true);
		cf.car_Tinting(true);

			
	}
	public static String car_Brand(String brand) {
		System.out.println("This made by :"+brand);
		return brand;
	}

	
}
