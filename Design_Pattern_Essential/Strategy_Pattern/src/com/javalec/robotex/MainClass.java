package com.javalec.robotex;

import com.javalec.robotex.inter.FlyNo;
import com.javalec.robotex.inter.FlyYes;
import com.javalec.robotex.inter.KnifeLaser;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.setFly(new FlyNo());
		superRobot.action_fly();
		superRobot.action_missile();
		superRobot.action_knife();
		superRobot.action_run();
		
		System.out.println("================");
		
		Robot standardRobot = new StandardRobot();
		standardRobot.shape();
		standardRobot.setFly(new FlyYes());
		standardRobot.action_fly();
		standardRobot.action_missile();
		standardRobot.action_knife();
		standardRobot.action_run();
		
		System.out.println("================");
		
		Robot lowRobot = new LowRobot();
		lowRobot.shape();
		lowRobot.setFly(new FlyYes());
		lowRobot.setKnife(new KnifeLaser());
		lowRobot.action_fly();
		lowRobot.action_missile();
		lowRobot.action_knife();
		lowRobot.action_run();
		
	
	}//End Main

}//End Class
