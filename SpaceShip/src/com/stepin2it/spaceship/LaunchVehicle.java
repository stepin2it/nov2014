package com.stepin2it.spaceship;


public class LaunchVehicle extends Vehicle{
	@Override
	public void doTestOps() {
		super.doTestOps();
		System.out.println("I have an implementation in base class");
		System.out.println("But I want to do something more");
	
	}

}
