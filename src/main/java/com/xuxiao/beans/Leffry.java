package com.xuxiao.beans;

public class Leffry {
	public String name;
	public int age;
	public Xuxiao husband;
	public Leffry(String name, int age, Xuxiao husband) {
		super();
		this.name = name;
		this.age = age;
		this.husband = husband;
	}
	public Leffry() {
	}
	@Override
	public String toString() {
		return "Leffry [name=" + name + ", age=" + age + ", husband=" + husband + "]";
	}
	

}
