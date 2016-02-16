package com.javalec.builder_pattern_ex_two;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		ComputerFactory factory = new ComputerFactory();
		factory.setBlueprint(new LgGramBlueprint());
		factory.make();
		
		Computer computer = factory.getComputer();
		
		System.out.println(computer.toString());
		
	}

}
