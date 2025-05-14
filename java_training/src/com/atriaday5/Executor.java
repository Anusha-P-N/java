package com.atriaday5;

	class ClassBase {
		int varDefault = 10;
		public int varPublic = 20;
		private int varPrivate = 30;
		protected int varProtected = 80;

		void methodDefault() {
			System.out.println("I am a default method");
			System.out.println("Default Variable: " + varDefault);
		}

		public void methodPublic() {
			System.out.println("I am a public method");
			System.out.println("Public Variable: " + varPublic);
		}

		private void methodPrivate() {
			System.out.println("I am a private method");
			System.out.println("Private Variable: " + varPrivate);
		}

		protected void methodProtected() {
			System.out.println("I am a protected method");
			System.out.println("Protected Variable: " + varProtected);
		}

		// Setter for private variable
		public void setVarPrivate(int varPrivate) {
			this.varPrivate = varPrivate;
		}

		// Public method to call private method
		public void callPrivateMethod() {
			methodPrivate();
		}
	}

	public class Executor {
		public static void main(String[] args) {
			ClassBase b1 = new ClassBase();

			b1.varDefault = 40;
			b1.varPublic = 70;
			b1.varProtected = 90;

			b1.setVarPrivate(80);

			b1.methodDefault();
			b1.methodPublic();
			b1.methodProtected();
			b1.callPrivateMethod();
		}
	}

