package com.javalec.builder_pattern_ex_two;

public abstract class BluePrint {

	protected Computer computer;
	
	abstract public void setCpu();
	abstract public void setRam();
	abstract public void setStorage();

	abstract public Computer getComputer();
	
}
