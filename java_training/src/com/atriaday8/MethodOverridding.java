package com.atriaday8;

public class MethodOverridding {

	public static void main(String[] args) {
		//dynamic binding
				RBI rbi;
				
				rbi = new SBI();
				System.out.println(rbi.getRateOfInterest());
				rbi =new HDFC();
				System.out.println(rbi.getRateOfInterest());
				rbi =new ICICI();
				System.out.println(rbi.getRateOfInterest());
				
		}
		}
