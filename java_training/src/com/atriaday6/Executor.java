package com.atriaday6;

public class Executor {

	public static void main(String[] args) {
		Base b1 = new Base();

		// You can't directly access private variables (like varPrivate), so use setter
		b1.setVarPrivate(90); // Correct way to set private variable

		// Now call the accessible methods
		b1.methodDefault();     // Accessible in the same package
		// b1.methodPrivate();  // ❌ Not accessible outside Base class - remove or comment this
		b1.methodProtected();   // Accessible in the same package
		b1.methodPublic();      // Always accessible
	}
}
