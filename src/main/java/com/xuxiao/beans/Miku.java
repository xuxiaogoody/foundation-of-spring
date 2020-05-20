package com.xuxiao.beans;
/**
 * ²âÊÔ¹¹Ôì×¢Èë
 * @author xuxiao
 *
 */
public class Miku {
	private String name;
	private int age;
	private Xuxiao husband;

	public Miku(String name, int age, Xuxiao husband) {
		super();
		this.name = name;
		this.age = age;
		this.husband = husband;
	}

	@Override
	public String toString() {
		return "Miku [name=" + name + ", age=" + age + ", husband=" + husband + "]";
	}

	

}
