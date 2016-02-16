package com.javalec.factory_method_pattern;

import com.javalec.factory_method_pattern_fw.Creator;
import com.javalec.factory_method_pattern_fw.Item;

public class MainClass {

	public static void main(String...strings) {
		
		Creator creator = new DefaultItemCreator();
		
		Item item1 =  creator.create("Wooden Knife");;
		Item item2 =  creator.create("Wooden Shield");;
		Item item3 =  creator.create("Wooden Armor");;
		
		item1.use();
		item2.use();
		item3.use();
		
	}
}
