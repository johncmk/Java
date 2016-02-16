package com.javalec.singleton_pattern_simple;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
	
		System.out.println(obj.getName());
		System.out.println(obj2.getName());
		
		obj2.setName("Tom");
		
		System.out.println(obj.getName());
		System.out.println(obj2.getName());
		
	}

}
