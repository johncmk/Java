package com.javalec.builder_pattern_ex_two;

public class ComputerFactory {

	private BluePrint blueprint;
	
	public void setBlueprint(BluePrint blueprint) {
		this.blueprint = blueprint;
	}
	
	public void make() {
		blueprint.setRam();
		blueprint.setCpu();
		blueprint.setStorage();
	}
	
	public Computer getComputer() {
		return blueprint.getComputer();
	}
	
}
