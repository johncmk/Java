package com.javalec.singleton_pattern_simple;

public class Singleton {

	private static Singleton instance = null;
	
	private String name;

	public static void setInstance(Singleton instance) {
		Singleton.instance = instance;
	}

	private Singleton(){
		name="John";
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
