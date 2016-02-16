package com.javalec.output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {

	private static InputStream input;
	private static OutputStream output;
	
	public static void copy(String from, String to) {
		
		try {
			input = new FileInputStream(from);
			output = new FileOutputStream(to);
			
			while(true) {
				int data = input.read();
				if( data == -1 )
					break;
				output.write(data);
			}
			
		} catch (Exception e) {
			e.getMessage();
		} finally {
			if(input != null) {
				try {
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		if(output != null) {
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
