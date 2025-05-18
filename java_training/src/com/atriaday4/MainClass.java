package com.atriaday4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen c = new Citizen("Bangalore", "Rahul", "1234-5678-9012", 9876543210L);
        System.out.println("Name: " + c.getName());
        System.out.println("Address: " + c.getAddress());
        System.out.println("Aadhar No: " + c.getAadharNo());
        System.out.println("Phone No: " + c.getPhNo());

	}

}
