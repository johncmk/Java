package com.javalec.vistor_pattern.concrete;


import com.javalec.vistor_pattern.contract.Visitable;
import com.javalec.vistor_pattern.contract.Visitor;

public class VisitableA implements Visitable {

	int numberOfMember;
	
	public VisitableA(int numberOfMember) {
		this.numberOfMember = numberOfMember;
	}
	
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	

}
