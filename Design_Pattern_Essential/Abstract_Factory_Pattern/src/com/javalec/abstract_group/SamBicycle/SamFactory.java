package com.javalec.abstract_group.SamBicycle;


import com.javalec.abstract_group.BikeFactory;
import com.javalec.abstract_group.Body;
import com.javalec.abstract_group.Wheel;

public class SamFactory implements BikeFactory {

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new SamWheel();
	}

	

}
