package com.javalec.decorator_pattern.concrete;

import com.javalec.decorator_pattern.abst.AbstAdding;
import com.javalec.decorator_pattern.abst.IBeverage;

public class Espresso extends AbstAdding {

	static protected int espressoCount = 0;

	public Espresso(IBeverage base) {
		super(base);
	}
	
	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return super.getTotalPrice() + getAddPrice();
	}
	
	private static int getAddPrice() {
		espressoCount++;
		
		int addPrice = 100;
		
		if(espressoCount > 1 ) {
			addPrice = 70;
		}
		return addPrice;
	}
	
}//End Class
