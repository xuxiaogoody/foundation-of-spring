package com.xuxiao.beans;

import java.util.ArrayList;
/**
 * ≤‚ ‘xml◊∞‘ÿºØ∫œ
 * @author xuxiao
 *
 */
public class MyWifes {
	public String name;
	public int age;
	public ArrayList<String> wifes;
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
	public ArrayList<String> getWifes() {
		return wifes;
	}
	public void setWifes(ArrayList<String> wifes) {
		this.wifes = wifes;
	}
	@Override
	public String toString() {
		return "MyWifes [name=" + name + ", age=" + age + ", wifes=" + wifes + "]";
	}
	

}
