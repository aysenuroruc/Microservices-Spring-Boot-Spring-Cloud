package com.qa.main.cache;

public class PersonData {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public PersonData(String name, String data) {
		//super();
		this.name = name;
		this.data = data;
	}
	private String name;
	private String data;
	
}
