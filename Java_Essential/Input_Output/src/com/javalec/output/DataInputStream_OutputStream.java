package com.javalec.output;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataInputStream_OutputStream {

	public void copy(String from, String to ) {

		if(from.isEmpty()) {
			return;
		}
		else if(to.isEmpty()) {
			return;
		}
		
		InputStream input = null;
		OutputStream output = null;
		
		DataInputStream d_input = null;
		DataOutputStream d_output = null;
		
		try {
			
			//Read
			input = new FileInputStream(from);
			d_input = new DataInputStream(input);
			String read_data = d_input.readUTF();
			
			//Write
			output = new FileOutputStream(to);
			d_output = new DataOutputStream(output);
			d_output.writeUTF(read_data);
			
		} catch (Exception e ) {
			e.getMessage();
		} finally {
			if(input != null){
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
			
			if(d_input != null) {
				try {
					d_input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(d_output != null) {
				try {
					d_output.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}//End
	
}//End 

