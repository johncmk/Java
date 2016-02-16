package com.javalec.robotex;

import com.javalec.robotex.inter.IFly;
import com.javalec.robotex.inter.IKnife;
import com.javalec.robotex.inter.IMissile;

public abstract class Robot {

	protected IFly fly;
	protected IMissile missile;
	protected IKnife knife;

	public void action_fly() {
		fly.fly();
	}
	
	public void action_missile() {
		missile.missile();
	}
	
	public void action_knife() {
		knife.knife();
	}
	
	public void action_run() {
		System.out.println("I can run");
	}
	
	public void setFly(IFly fly) {
		this.fly = fly;
	}
	
	public void setMissile(IMissile missile) {
		this.missile = missile;
	}
	
	public void setKnife(IKnife knife) {
		this.knife = knife;
	}
	protected abstract void shape();
}//End
