package com.javalec.bridge_pattern.morse_code;

public class MorseCode {

	private MorseCodeFunction func;
	
	public MorseCode(MorseCodeFunction func) {
		this.func = func;
	}
	
	public void dot() {
		this.func.dot();
	}
	
	public void dash() {
		this.func.dash();
	}
	
	public void space() {
		this.func.space();
	}
	
}
