package com.javalec.template_method_pattern_ex_two;

public class GameConnectHelper extends AGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		// TODO Auto-generated method stub
		System.out.println("Upgrade Decode");
		return string;
	}

	@Override
	protected boolean authentication(String string, String password) {
		// TODO Auto-generated method stub
		System.out.println("ID/PW authentication succeed");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		// TODO Auto-generated method stub
		System.out.println("authorization checked");
		//Check user's age and choose what to return
		return 0;
	}

	@Override
	protected String connection(String info) {
		// TODO Auto-generated method stub
		System.out.println("Finally Connect to Server");
		return info;
	}

	
	
}
