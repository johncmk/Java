package com.javalec.InetAddress;

import java.net.InetAddress;
import java.util.Scanner;

public class InetAds {

	Scanner scan;
	
	public InetAds() {
		System.out.println("Please input host name: ");
		
		scan = new Scanner(System.in);
		
		try {
			InetAddress inetAds = InetAddress.getByName(scan.next());
			
			System.out.println("Computert Name : " + inetAds.getHostName());
			System.out.println("Computer IP : " + inetAds.getHostAddress());
		} catch (Exception e ) {
			System.out.println(e.getMessage());
		}
	}
	
}//End
