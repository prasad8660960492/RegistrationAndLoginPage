package com.techpalle.model1;

public class Student {
	private String name;
	private String email;
	private String password;
	private String state;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Student(String name, String email, String password, String state) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.state = state;
	}
	public static boolean validCustomer(String email2, String password2) {

		return false;
	}
	

}
