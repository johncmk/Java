package com.javalec.intertoy;

public class MazingerToyClass implements Missile, MoveArmLeg {

	public MazingerToyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("I am Mazinger");
		canMoveArmLeg();
		canMissile();
		System.out.println("================");
	}
	
	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("able to move arms and legs");
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("I can shoot missile");
	}

	
	
}
