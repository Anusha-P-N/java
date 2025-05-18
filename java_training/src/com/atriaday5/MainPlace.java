package com.atriaday5;

public class MainPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City c = new City();

        // Setting values from Country, State, City
        c.setName("India");            // Country
        c.setCaptital("New Delhi");    // Country

        c.setStatename("Karnataka");   // State
        c.setLang("Kannada");          // State

        c.setCityname("Bangalore");    // City
        c.setArea("Hebbal");      // City

        System.out.println(c);
    }
}
