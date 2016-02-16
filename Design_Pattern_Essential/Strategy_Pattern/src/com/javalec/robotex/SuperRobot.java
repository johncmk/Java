package com.javalec.robotex;

import com.javalec.robotex.inter.FlyYes;
import com.javalec.robotex.inter.KnifeLaser;
import com.javalec.robotex.inter.MissileYes;

public class SuperRobot extends Robot {

	
	public SuperRobot() {
		fly = new FlyYes();
		knife = new KnifeLaser();
		missile = new MissileYes();
	}

	@Override
	protected void shape() {
		// TODO Auto-generated method stub
		System.out.println("I am super robot. I have arms, legs, body, and a booster");
	}

	
}//End
