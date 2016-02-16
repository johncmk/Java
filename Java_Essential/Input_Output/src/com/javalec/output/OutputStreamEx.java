package com.javalec.output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {

	private static OutputStream out;
	
	public static void write(String address, String sentence) {
		
		if(sentence.isEmpty())
			return;
		else if(address.isEmpty())
			return;
		
		try {
			out = new FileOutputStream(address);
			byte[] data = sentence.getBytes();
			out.write(data);
		} catch (Exception e) {
			e.getMessage();
		} finally {
			if(out != null)
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}//End
	
}//End
