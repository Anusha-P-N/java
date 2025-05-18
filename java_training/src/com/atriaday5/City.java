package com.atriaday5;

public class City extends State {
	private String cityname;
	private String area;
	public String getCityname() {
		return cityname;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	@Override
	public String toString() {
		return "City [cityname=" + cityname + ", area=" + area + ", getStatename()=" + getStatename() + ", getLang()="
				+ getLang() + ", getname()=" + getname() + ", getCaptital()=" + getCaptital() + "]";
	}
	
	
	

}
