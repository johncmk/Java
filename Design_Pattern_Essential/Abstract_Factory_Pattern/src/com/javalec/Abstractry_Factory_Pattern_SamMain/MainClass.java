package com.javalec.Abstractry_Factory_Pattern_SamMain;

import com.javalec.abstract_group.BikeFactory;
import com.javalec.abstract_group.Body;
import com.javalec.abstract_group.Wheel;
import com.javalec.abstract_group.SamBicycle.SamFactory;
import com.javalec.abstract_group.gt.GtBikeFactory;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		BikeFactory factory = new SamFactory();
		BikeFactory factory = new GtBikeFactory();
		
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
	}

}
