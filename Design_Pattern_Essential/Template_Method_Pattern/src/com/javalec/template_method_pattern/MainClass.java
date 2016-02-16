package com.javalec.template_method_pattern;

public class MainClass {

	public static void main(String...strings) {
		
		AConnectHelper a_conn_helper = new ConnectHelper();
		
		String id = "john";
		String password = "1010";
		
		a_conn_helper.reqeustConnection(id, password);
	}
}
