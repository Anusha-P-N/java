package com.atriaday6;

public class Base {
//creating instance variables
		int varDefault=10;
		public int varPublic=20;
		private int varPrivate=30;
		protected int varProtected=80;
		
		
		
		public int getVarPrivate() {
			return varPrivate;
		}

		public void setVarPrivate(int varPrivate) {
			this.varPrivate = varPrivate;
		}

		void methodDefault() {
			
			System.out.println("im a default method:");
			System.out.println("default varaible:" +varDefault);
			
		}
		
		void methodPublic(){
			System.out.println("im a public method:");
			System.out.println("public varaible:" +varPublic);
			
		}
		
		void methodPrivate(){
			System.out.println("im a private method:");
			System.out.println("private varaible:" +varPrivate);
			
		}
		
		void methodProtected(){
			System.out.println("im a protected method:");
			System.out.println("protected varaible:" +varProtected);
			
		}

		}
