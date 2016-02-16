package com.javalec.soket_chat_program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Never get response to server, but
 * Since socket can communicate, it can
 * send msg to server
 * @author chaos408
 *
 */
public class ClientSocket_ex {

	Socket socket = null;
	PrintWriter writer = null;
	BufferedReader reader = null;
	
	public ClientSocket_ex() {
		try {
			
			socket = new Socket("localhost",2000);
			writer = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String str = null;
			BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in));
			
			while( (str = sReader.readLine()) != null) {
				writer.println(str);
				System.out.println("output : " + str);
			}
			
			writer.close();
			reader.close();
			sReader.close();
			socket.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main (String...strings) {
		new ClientSocket_ex();
	}
	
}
