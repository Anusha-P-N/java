package com.atriaday4;

public class Citizen {

	    private String address;
	    private String name;
	    private String aadharNo;
	    private long phNo;

	    // Default constructor
	    public Citizen() {}

	    // Parameterized constructor
	    public Citizen(String address, String name, String aadharNo, long phNo) {
	        this.address = address;
	        this.name = name;
	        this.aadharNo = aadharNo;
	        this.phNo = phNo;
	    }

	    public String getAddress() { return address; }
	    public void setAddress(String address) { this.address = address; }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public String getAadharNo() { return aadharNo; }
	    public void setAadharNo(String aadharNo) { this.aadharNo = aadharNo; }

	    public long getPhNo() { return phNo; }
	    public void setPhNo(long phNo) { this.phNo = phNo; }
	}
