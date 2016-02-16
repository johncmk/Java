package com.javalec.prototype;

public class Circle extends Shape{

	private int x,y;
	private int r;

	public Circle() {
		
	}
	
	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
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

	public Circle copy() {
		Circle circle = null;
		try {
			circle = (Circle) clone();
			circle.x++;
			circle.y++;
			return circle;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return circle;
	}
}
