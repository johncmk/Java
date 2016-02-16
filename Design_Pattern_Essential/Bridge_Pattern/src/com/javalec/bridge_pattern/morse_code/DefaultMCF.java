package com.javalec.bridge_pattern.morse_code;

public class DefaultMCF implements MorseCodeFunction {

	@Override
	public void dot() {
		// TODO Auto-generated method stub
		System.out.print(".");
	}

	@Override
	public void dash() {
		// TODO Auto-generated method stub
		System.out.print("-");
	}

	@Override
	public void space() {
		// TODO Auto-generated method stub
		System.out.print(" ");
	}

}
