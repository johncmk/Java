package com.javalec.output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {

	private static InputStream input;

	public static void read_data(String address) {
		
		if(address.isEmpty())
			return;
		
		try {
			input = new FileInputStream(address);
			while(true) {
				int data = input.read();
				System.out.println("Data: "+ data);
				if( data == -1)
					break;
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(input != null)
				try {
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}//End
	
}//End
