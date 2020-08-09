package com.sob.suza;

public class login {
private String name,password;

	public void setPassword(String password) {this.password = password;}
	
	public String getPassword() {return password;}
	
	public void setName(String name) {this.name =name;}

	public String getName() {return name;}

	public boolean validate() {
		if(name.equals("Zulekha") && password.equals("123")) {
			return true;
		}else
		return false;
		
	}

}
