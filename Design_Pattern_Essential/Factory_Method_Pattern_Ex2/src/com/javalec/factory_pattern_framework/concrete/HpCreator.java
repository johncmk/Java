package com.javalec.factory_pattern_framework.concrete;

import java.util.Date;

import com.javalec.factory_pattern_framework.AItemCreator;
import com.javalec.factory_pattern_framework.IItem;

public class HpCreator extends AItemCreator {

	@Override
	protected void requestItemsInfo() {
		// TODO Auto-generated method stub
		System.out.println("Retrieve HP Portion information from DB");
	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("LOG : Craeted new HP Portion" + new Date());	
	}

	@Override
	protected IItem createItem() {
		// TODO Auto-generated method stub
		return new HpPortion();
	}

}
