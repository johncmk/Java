package com.javalec.urlconnection;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URL_ex {

	public URL_ex() {
		
		String fw_ads = "C:\\Java_Workspace\\URLConnection\\";
		String code = null;
		System.out.println("Enter Web Address : ");
		Scanner scan = new Scanner(System.in);
		String ads = scan.next();
		
		try {
			URL url = new URL(ads);
			URLConnection conn = url.openConnection();
			BufferedReader web_data = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			FileWriter fw = new FileWriter(fw_ads + "URL.html", false);
			
			while( (code = web_data.readLine()) != null) {
				fw.write(code);
			}
			System.out.println("The End");
			
			fw.close();
			web_data.close();
			
		} catch (Exception e ) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}//End
