package com.example;

import spring.dependency.Vehicle;

public class Car implements Vehicle  {
	private String fuelType;
	private String speed;
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	@Override
	public void move() {
		System.out.println("fuelType "+fuelType);
		System.out.println("speed :"+speed);
		System.out.println("Bus started..............");
		
	}

}
