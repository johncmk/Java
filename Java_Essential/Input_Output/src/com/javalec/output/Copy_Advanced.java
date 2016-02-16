package com.javalec.output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy_Advanced {

	private static OutputStream output;
	private static InputStream input;
	
	public static void copy(String from, String to) {
		
		try {
			input = new FileInputStream(from);
			output = new FileOutputStream(to);
			
			byte[] data_byte = new byte[5]; // read data by 5bytes so it's faster than regular 1 bye copy
			
			while(true) {
				int data = input.read(data_byte);
				if( data == -1 ) {
					break;
				}
				output.write(data_byte, 0, data);
			}
			
		} catch (Exception e) {
			e.getMessage();
		} finally {
			if( input != null) {
				try {
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if( output != null ) {
				try {
					output.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}//End
	
}//End
