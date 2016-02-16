package com.javalec.template_method_pattern;

public class ConnectHelper extends AConnectHelper {

	@Override
	protected String doSecurity(String info) {
		// TODO Auto-generated method stub
		return info;
	}

	@Override
	protected String authentication(String id, String password) {
		// TODO Auto-generated method stub
		System.out.println("ConnectHelper.Class.authentication");
		return (id.equals("john") && password.equals("1010")) ? "John Smith" : "Anonymous";
	}

	@Override
	protected int authorization(final String userName) {
		// TODO Auto-generated method stub
		System.out.println("ConnectHelper.Class.authorization");
		switch(userName) {
			case "John Smith":
				return 0;
			default:
				return 3;			
			}
	}

	@Override
	protected String connection(String info) {
		// TODO Auto-generated method stub
		System.out.println("ConnectHelper.Class.connection");
		return info;
	}

}
