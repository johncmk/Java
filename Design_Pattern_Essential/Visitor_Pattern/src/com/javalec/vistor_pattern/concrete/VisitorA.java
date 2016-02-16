package com.javalec.vistor_pattern.concrete;

import com.javalec.vistor_pattern.contract.Visitable;
import com.javalec.vistor_pattern.contract.Visitor;

public class VisitorA implements Visitor {

	private int number;
	
	
	public VisitorA() {
		this.number = 0;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public void visit(Visitable visitable) {
		// TODO Auto-generated method stub

	}

}
