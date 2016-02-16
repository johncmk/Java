package com.javalec.adapter_pattern;

public class MainClass {

	public static void main(String...strings) {
		
		IAdapter target = new AdapterImpl();
		
		System.out.println(target.twiceOf(100.0f));
		System.out.println(target.halfOf(100.3f));
	}
}
