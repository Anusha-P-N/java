package com.atriaday6;

class MethodOverloading {
	public static int addition(int a, int b) {
		return a + b;
	}

	public static int addition(int a, int b, int c) {
		return a + b + c;
	}

	public static float addition(int a, float b) {
		return a + b;
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		System.out.println(MethodOverloading.addition(7, 8, 9));    // 24
		System.out.println(MethodOverloading.addition(7, 8));       // 15
		System.out.println(MethodOverloading.addition(7, 0.1f));    // 7.1
	}

}
