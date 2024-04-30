package com.user;

public class User {
	private int id;
	private String name,password,email,sex,country;
	public int getId() {
		return id;
	}
    public void setId(int id) {
    	this.id=id;
    	
    }
    public String getname() {
    	return name;
    }
    public void setname(String name) {
    	this.name=name;
    }
    public String getPassword() {
    	return password;
    }
    public void setpassword(String password) {
    	this.password=password;
    	 }
    public String getemail() {
    	return email;
    }
    public void setemail(String email) {
    	this.email=email;
    }
    public String getsex() {
    	return sex;
    }
    public void setsex(String sex) {
    	this.sex=sex;
    }
    public String getcountry() 
    {
    	return country;
    }
    public void setcountry(String country) {
    	this.country=country;
    }
    
}
