package com.javalec.template_method_pattern;

public abstract class AConnectHelper {

	abstract protected String doSecurity(String info);

	abstract protected String authentication(String id, String password);
	
	abstract protected int authorization(String userName);
	
	abstract protected String connection(String info);
	
	public String reqeustConnection(String id, String password) {
		
		String user_name;
				
		
		StringBuilder user_info;
		
		user_name = authentication(id, password);
		
		int result = authorization(user_name);
		
		switch(result) {
			case 0:
				System.out.println("Free User");
				break;
			case 1:
				System.out.println("Non Free User");
				break;
			case 2:
				System.out.println("Game Master");
				break;
			case 3:
				System.out.println("Anonymous is not allow to login");
				break;
			default:
				break;
		}
		
		user_info = new StringBuilder("USER_NAME : " + user_name + " , ID : " + id +" , PASSWORD : " + password);
		
		return connection(user_info.toString());
	}
	
}
