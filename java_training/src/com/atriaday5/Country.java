package com.atriaday5;

public class Country {

	private String name;
	private String captital;
	public String getname() {
		return name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCaptital() {
		return captital;
	}
	public void setCaptital(String captital) {
		this.captital = captital;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", captital=" + captital + "]";
	}
	

}
