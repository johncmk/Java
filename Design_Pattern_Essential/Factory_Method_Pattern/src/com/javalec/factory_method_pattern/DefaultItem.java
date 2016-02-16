package com.javalec.factory_method_pattern;

import com.javalec.factory_method_pattern_fw.Item;

public class DefaultItem extends Item {

	private String itemName;
	
	public DefaultItem(String itemName) {
		this.itemName = itemName;
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("used " + itemName);
	}

}
