package com.javalec.decorator_pattern;

import java.util.Scanner;

import com.javalec.decorator_pattern.abst.IBeverage;
import com.javalec.decorator_pattern.concrete.Base;
import com.javalec.decorator_pattern.concrete.Espresso;
import com.javalec.decorator_pattern.concrete.Milk;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		IBeverage beverage = new Base();
		
		boolean done = false;
		
		while( !done ) {
			System.out.println("Current beverage price : " + beverage.getTotalPrice());
			System.out.println("Please select... 1:Shot of Espresso | 2:Milk | Ener nothing if youe dink are all set.");
			
			switch(sc.nextInt()) {
				case 1:
					System.out.println("1 Shot of espresso is added");
					beverage = new Espresso(beverage);
					break;
				case 2:
					System.out.println("Milk is added");
					beverage = new Milk(beverage);
					break;
				default:
					System.out.println("Your drink is set now. Thank you!");
					done = true;
					break;
			}
		}
		System.out.println("Total Beverage Price : " + beverage.getTotalPrice());
		sc.close();
		
		}//End Main
}//End Class
