package com.javalec.factory_pattern_framework.concrete;

import java.util.Date;

import com.javalec.factory_pattern_framework.AItemCreator;
import com.javalec.factory_pattern_framework.IItem;

public class StaminaCreator extends AItemCreator {

	@Override
	protected void requestItemsInfo() {
		// TODO Auto-generated method stub
		System.out.println("Retrieve Stamina Item information from DB");
	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("LOG : Create Stamina Portion and save information into DB for copy treat. " + new Date());
	}

	@Override
	protected IItem createItem() {
		// TODO Auto-generated method stub
		return new StaminaPortion();
	}

}
