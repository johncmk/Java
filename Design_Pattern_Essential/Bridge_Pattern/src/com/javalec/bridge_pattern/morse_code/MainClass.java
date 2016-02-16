package com.javalec.bridge_pattern.morse_code;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintMorseCode code = new PrintMorseCode(new DefaultMCF());
		
		code.g().a().r().a().m();
	}

}
