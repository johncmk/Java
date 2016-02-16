package com.javalec.factory_pattern_framework;

public abstract class AItemCreator {

	public IItem create() {
		
		IItem item;
		
		requestItemsInfo();
		item = createItem();
		createItemLog();
		
		return item;
	}
	
	//Retrieve Item info from DB before create new item
	abstract protected void requestItemsInfo();
	//Restore item info after create the item for copy treat
	abstract protected void createItemLog();
	//Algorithm that create item
	abstract protected IItem createItem();
	
}//End
