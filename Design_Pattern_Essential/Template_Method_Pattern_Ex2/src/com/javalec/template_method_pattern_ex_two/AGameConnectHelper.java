package com.javalec.template_method_pattern_ex_two;

public abstract class AGameConnectHelper {

	
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String string, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);


	public String requestConnectin(String encodedInfo) {
		
		
		//Decrypt encodedInfo
		String decodedInfo = doSecurity(encodedInfo);
		
		String id = "aaa";
		String password = "bbb";
		
		if(!authentication(id, password)) {
			throw new Error("ID and Password don't match");
		}
		
		String userName = "userName";
		int i = authorization(userName);
		
		switch(i) {
			case -1:
				throw new Error("You are under 19. The Game will be shutdown in 5 second");
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				break;
		}
		
		return connection(decodedInfo);
	}
	
}//End
