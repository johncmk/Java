package com.javalec.bridge_pattern.morse_code;

public class PrintMorseCode extends MorseCode {

	public PrintMorseCode(MorseCodeFunction fuction) {
		super(fuction);
		// TODO Auto-generated constructor stub
	}

	//garam
	public PrintMorseCode g() {
		dash();
		dash();
		dot();
		space();
		return this;
	}
	
	public PrintMorseCode a() {
		dot();
		dash();
		space();
		return this;
	}

	public PrintMorseCode r() {
		dot();
		dash();
		dot();
		space();
		return this;
	}
	
	public PrintMorseCode m() {
		dash();
		dash();
		space();
		return this;
	}
}
