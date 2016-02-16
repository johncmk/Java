package com.javalec.factory_pattern_framework.concrete;

import com.javalec.factory_pattern_framework.IItem;

public class HpPortion implements IItem {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Heal HP!");
	}

}
