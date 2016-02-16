package com.javalec.builder_pattern_ex_two;

public class LgGramBlueprint extends BluePrint {

	public LgGramBlueprint() {
		computer = new Computer("default", "defualt", "default");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setCpu() {
		// TODO Auto-generated method stub
		computer.setCpu("i7");
	}

	@Override
	public void setRam() {
		// TODO Auto-generated method stub
		computer.setRam("8g");
	}

	@Override
	public void setStorage() {
		// TODO Auto-generated method stub
		computer.setStorage("256GB");
	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return this.computer;
	}

}
