package com.javalec.factory_pattern_framework.concrete;

import com.javalec.factory_pattern_framework.AItemCreator;
import com.javalec.factory_pattern_framework.IItem;

public class MainClass {

	public static void main(String...strings) {
		
		AItemCreator creator;
		IItem item;
	
		creator = new HpCreator();
		item = creator.create();
		item.use();
		
		creator = new MpCreator();
		item = creator.create();
		item.use();

		creator = new StaminaCreator();
		item = creator.create();
		item.use();
		
	}//End
}//End class
