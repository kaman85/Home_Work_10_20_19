package com.Cars;

public class Car_Features implements Car_Designed {

	public Boolean carSunroof(boolean sunroof) {
		System.out.println("This car carried Sunroof :" + sunroof);
		return sunroof;
	}

	public Boolean carMoonroof(boolean moonroof) {
		System.out.println("This car carried Moonroof :" + moonroof);
		return moonroof;
	}

	public String carColores(String colores) {
		System.out.println("This is " + colores + " car.");
		return colores;
	}

	public int carDoors(int doors) {
		System.out.println("This is " + doors + " Doors car.");
		return doors;
	}

	public String carSadanOrSaloon(String sadan_or_Saloon) {
		System.out.println("This is " + sadan_or_Saloon + " car.");
		return sadan_or_Saloon;
	}

	public boolean car_Tinting(boolean tintings) {
		System.out.println("This car is Tinted : " + tintings);
		return tintings;
	}

	@Override
	public String carEngines(String enginesize) {
		System.out.println("Engine Size is : "+enginesize);
		return enginesize;
	}

	@Override
	public String carTransmission(String carTransmission_System) {
		System.out.println("Transmission System is :"+carTransmission_System);
		return carTransmission_System;
	}
	

}
