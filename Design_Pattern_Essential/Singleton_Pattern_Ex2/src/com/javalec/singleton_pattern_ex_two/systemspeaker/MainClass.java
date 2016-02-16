package com.javalec.singleton_pattern_ex_two.systemspeaker;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SystemSpeaker obj = SystemSpeaker.getInstance();
		SystemSpeaker obj2 = SystemSpeaker.getInstance();
		
		System.out.println(obj.getVolume());
		System.out.println(obj2.getVolume());
	
		obj.setVolume(10);
	
		System.out.println(obj.getVolume());
		System.out.println(obj2.getVolume());
	
	}

}
