package com.xuxiao.bean;

public class Mea {
	public String name;
	public int age;
	public Mea(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Mea() {
	}

	@Override
	public String toString() {
		return "Mea [name=" + name + ", age=" + age + "]";
	}
	

}
