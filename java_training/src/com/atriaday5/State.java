package com.atriaday5;

public class State extends Country {
	private String statename;
	private String lang;
	public String getStatename() {
		return statename;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	@Override
	public String toString() {
		return "State [statename=" + statename + ", lang=" + lang + "]";
	}
	

}
