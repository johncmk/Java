package com.javalec.factory_pattern_framework.concrete;

import com.javalec.factory_pattern_framework.IItem;

public class StaminaPortion implements IItem {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Healed Stamina!");
	}

}
