package com.javalec.robotex;

import com.javalec.robotex.inter.FlyNo;
import com.javalec.robotex.inter.KnifeNo;
import com.javalec.robotex.inter.MissileNo;

public class LowRobot extends Robot{
	

	public LowRobot() {
		fly = new FlyNo();
		knife = new KnifeNo();
		missile= new MissileNo();
	}

	@Override
	protected void shape() {
		// TODO Auto-generated method stub
		System.out.println("I am low robot. I have no arms");
	}

}//End
