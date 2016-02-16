package com.javalec.decorator_pattern.concrete;

import com.javalec.decorator_pattern.abst.AbstAdding;
import com.javalec.decorator_pattern.abst.IBeverage;

public class Milk extends AbstAdding {

	public Milk(IBeverage material) {
		super(material);
	}
	
	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return super.getTotalPrice() + 50;
	}
	
}
