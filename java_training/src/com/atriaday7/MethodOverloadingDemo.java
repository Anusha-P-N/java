package com.atriaday7;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
int a = (int) MethodOverloading.addition(2, 3,4);
		
		System.out.println(a);
		
		float b = (float) MethodOverloading.addition(3,4,5);
		System.out.println(b);
		
		double c = MethodOverloading.addition(4,5.2,6.5);
		System.out.println(c);
		
	}


	}