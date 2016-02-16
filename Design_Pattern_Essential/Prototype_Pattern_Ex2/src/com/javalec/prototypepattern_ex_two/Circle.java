package com.javalec.prototypepattern_ex_two;

public class Circle extends AShape {

	private int x, y;
	private int r;
	private Double d;
	private A a;
	
	public Circle() {
		a = new A();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Double getD() {
		return d;
	}

	public void setD(Double d) {
		this.d = d;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
	
	public AShape copy() {
		Circle shape = null;
		
		try {
			shape = (Circle) clone();
			
			//Remove this comment if client decide to not to move shape on the spot
//			shape.setX(shape.getX()+1);
//			shape.setY(shape.getY()+1);
//			shape.setA((A)shape.getA().clone());
			
			return shape;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shape;
	}
	
}
