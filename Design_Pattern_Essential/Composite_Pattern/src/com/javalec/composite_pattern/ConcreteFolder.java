package com.javalec.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteFolder extends Component{

	public ConcreteFolder(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private List<Component> children = new ArrayList<>();
	
	public boolean addComponent(Component component) {
		return children.add(component);
	}

	public boolean removeComponent(Component component) {
		return children.remove(component);
	}
	
	public List<Component> getChildern() {
		return children;
	}
	
}//End
