package com.javalec.soket_chat_program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * This server never write back to client.
 * It only receive a message from client
 * and output to screen.
 * @author chaos408
 *
 */
public class ServerSocket_ex {

	ServerSocket serverSocket = null;
	Socket socket = null;
	PrintWriter writer = null;
	BufferedReader reader = null;
	String lineStr; 
	
	public ServerSocket_ex() {
		try {

			serverSocket = new ServerSocket(2000);
			
			while(true) {
				socket = serverSocket.accept();
				System.out.println("Clinet Request");
				
				writer = new PrintWriter(socket.getOutputStream(), true);
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				while( (lineStr = reader.readLine()) != null) {
					writer.write(lineStr);
					System.out.println("intput : " + lineStr);
				}
				
				writer.close();
				reader.close();
				socket.close();
			}
			
		} catch (Exception e ) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String...strings) {
		new ServerSocket_ex();
	}
	
}//End
