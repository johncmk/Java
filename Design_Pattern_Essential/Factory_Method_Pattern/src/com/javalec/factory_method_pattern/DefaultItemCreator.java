package com.javalec.factory_method_pattern;

import com.javalec.factory_method_pattern_fw.Creator;
import com.javalec.factory_method_pattern_fw.Item;

public class DefaultItemCreator extends Creator {

	@Override
	protected String end(String itemName) {
		// TODO Auto-generated method stub
		System.out.println("Default Final Step");
		return itemName;
	}

	@Override
	protected String init(String itemName) {
		// TODO Auto-generated method stub
		System.out.println("Default Frist Step");
		return itemName;
	}

	@Override
	protected Item createItem(String itemName) {
		// TODO Auto-generated method stub
		return new DefaultItem(itemName);
	}

	
}
