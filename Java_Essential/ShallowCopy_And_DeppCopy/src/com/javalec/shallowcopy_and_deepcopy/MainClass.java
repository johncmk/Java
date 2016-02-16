package com.javalec.shallowcopy_and_deepcopy;

import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Shallow Copy
		Robot robot_original = new Robot("T2000",12345, new Date());
		Robot robot_shallow_copy = robot_original;
		
		System.out.println(robot_original.toString());
		System.out.println(robot_shallow_copy.toString());
		
		//Deep Copy
		Robot robot_deep_copy = robot_original.copy();
		
		System.out.println(robot_original.toString());
		System.out.println(robot_deep_copy.toString());
		
	}//End Main

}//End Class
