package com.javalec.factory_pattern_framework.concrete;

import java.util.Date;

import com.javalec.factory_pattern_framework.AItemCreator;
import com.javalec.factory_pattern_framework.IItem;

public class MpCreator extends AItemCreator {

	@Override
	protected void requestItemsInfo() {
		// TODO Auto-generated method stub

		System.out.println("Retrieve MP Portion information from DB");
	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("LOG : Craeted new MP Portion" + new Date());
	}

	@Override
	protected IItem createItem() {
		// TODO Auto-generated method stub
		return new MpPortion();
	}

}
