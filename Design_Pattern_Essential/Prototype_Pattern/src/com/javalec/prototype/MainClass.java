package com.javalec.prototype;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle(1,1,3);
		Circle c2 = c1.copy();
		
		System.out.println("Circle1 :");
		System.out.println(c1.getX() + ", " + c1.getY() + ", " + c1.getR());
		
		System.out.println("Circle2 :");
		System.out.println(c2.getX() + ", " + c2.getY() + ", " + c2.getR());
		
		
	}

}
