package com.javalec.intertoy;

public class AirPlaneToyClass implements Missile, Light {

	public AirPlaneToyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("I am AirPlane");
		canLight();
		canMissile();
		System.out.println("================");
	}
	
	@Override
	public void canLight() {
		// TODO Auto-generated method stub
		System.out.println("I can shoot light");
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("I can shoot missile");
	}

}
