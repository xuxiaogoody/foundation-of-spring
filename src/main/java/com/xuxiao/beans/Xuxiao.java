package com.xuxiao.beans;
/**
 * ≤‚ ‘set◊¢»Î
 * @author xuxiao
 *
 */
public class Xuxiao {
	private String name;
	private int age;
	public Xuxiao(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Xuxiao() {
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Xuxiao [name=" + name + ", age=" + age + "]";
	}
	

}
