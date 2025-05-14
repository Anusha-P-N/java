package com.atria.day2;

public class NestedDemo {

	public static void main(String[] args) {
		int a=10,b=20,c=5;
		if(a>b) {
		if(a>c)
			System.out.println(a);
		else
			System.out.println(b);
		}
		else {
			if(c>a)
				System.out.println(c);
				else
					System.out.println(b);
			}
		// TODO Auto-generated method stub

	}

}
