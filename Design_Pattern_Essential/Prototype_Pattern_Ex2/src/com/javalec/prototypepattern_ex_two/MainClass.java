package com.javalec.prototypepattern_ex_two;

public class MainClass {

	public static void main(String...strings ) {
		
		Circle circle1 = new Circle();
		
		circle1.setId("1");
		
		circle1.setX(1);
		circle1.setY(1);
		circle1.setR(3);

		circle1.getA().setX(1);
		
		Circle circle2 = (Circle) circle1.copy();
		
		System.out.println(circle1.getA().getX());
		System.out.println(circle2.getA().getX());

		circle1.getA().setX(2);
		
		System.out.println(circle1.getA().getX());
		System.out.println(circle2.getA().getX());

		circle1.getA().setX(3);

		System.out.println(circle1.getA().getX());
		System.out.println(circle2.getA().getX());
		
		
		
	}
}
