package com.javalec.bridge_pattern.morse_code;

public class SoundMCF implements MorseCodeFunction {

	@Override
	public void dot() {
		// TODO Auto-generated method stub
		System.out.print("Beep");
	}

	@Override
	public void dash() {
		// TODO Auto-generated method stub
		System.out.print("Bee~~p");
	}

	@Override
	public void space() {
		// TODO Auto-generated method stub
		System.out.print("um");
	}

}
