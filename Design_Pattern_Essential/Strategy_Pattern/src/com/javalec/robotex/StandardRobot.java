package com.javalec.robotex;

import com.javalec.robotex.inter.FlyNo;
import com.javalec.robotex.inter.KnifeWood;
import com.javalec.robotex.inter.MissileYes;

public class StandardRobot extends Robot{


	public StandardRobot() {
		fly = new FlyNo();
		knife = new KnifeWood();
		missile = new MissileYes();
	}

	@Override
	protected void shape() {
		// TODO Auto-generated method stub
		System.out.println("I am standard robot I have arms, legs and body");
	}
}//End
