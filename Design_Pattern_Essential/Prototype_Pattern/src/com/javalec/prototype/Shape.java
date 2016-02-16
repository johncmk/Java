package com.javalec.prototype;

/**
 * Cloneable interface is built-in java 
 * It will let you override clone method.
 * @author chaos408
 *
 */
public class Shape implements Cloneable{

	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
}
