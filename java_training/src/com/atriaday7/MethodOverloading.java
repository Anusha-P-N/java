package com.atriaday7;

public class MethodOverloading {

	public static int addition(int a, int b) {
		   return a+b;
	   }
	   public static float addition(int a, float b) {
		   return a+b;
	   }
	   public static float addition(float a, float b) {
		   return a+b;
	   }
	   public static int addition1(double d, double e, double f) {
		   return (int) (d+e);
	   }
	   public static double addition(double d, double b, double c) {
		   return d+b;
	   }
	}
