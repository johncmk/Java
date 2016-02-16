package com.javalec.abstract_group.gt;

import com.javalec.abstract_group.BikeFactory;
import com.javalec.abstract_group.Body;
import com.javalec.abstract_group.Wheel;

public class GtBikeFactory implements BikeFactory {

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new GtWheel();
	}

}
