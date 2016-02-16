package com.javalec.builder_pattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Computer computer = ComputerBuilder
//				.start()
//				.setCpu("i7")
//				.setRam("8g")
//				.build();
		
		Computer computer = ComputerBuilder
				.startWithCpu("i7")
				.setRam("8g")
				.setStorage("256GB SSD")
				.build();
		
		System.out.println(computer.toString());
	}

}
