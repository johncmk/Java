package com.javalec.strategypatter_simple;

public class AObj {

	Ainterface ainterface;
	
	public AObj() {
		ainterface = new AinterfaceImpl();
	}
	
	public void funcAA() {

		//Delegate
		ainterface.funcA();
		ainterface.funcA();
	}
	
}
