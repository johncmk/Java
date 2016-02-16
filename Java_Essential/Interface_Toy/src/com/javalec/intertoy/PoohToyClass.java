package com.javalec.intertoy;

public class PoohToyClass implements MoveArmLeg {

	public PoohToyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("I am Pooh");
		canMoveArmLeg();
		System.out.println("================");
	
	}
	
	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("Able to move arms and legs");
	}

}
