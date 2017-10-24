package com.kausik.test;

import java.util.Date;

public class ToString {
	String firstName = "";
	String lastName = "";
	Date dob = null;
	
	public ToString(String fn, String ln, Date db) {
		this.firstName = fn;
		this.lastName = ln;
		this.dob = db;
	}
	
	@Override
	public String toString() {
		return "FirstName= "+this.firstName+" LastName= "+this.lastName+" DOB= "+this.dob;
	}
	
	public static void main(String[] args) {
		ToString ts = new ToString("Tom", "Hank", new Date(1980, 0, 10));
		System.out.println("Object is "+ts);
	}
}
