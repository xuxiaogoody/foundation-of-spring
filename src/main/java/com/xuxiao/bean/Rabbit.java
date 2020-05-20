package com.xuxiao.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xuxiao.beans.Xuxiao;
@Component("zhinai")
public class Rabbit {
	@Value("œ„∑Á÷«ƒÀ")
	public String name;
	
	public Xuxiao husband;
	

	public Xuxiao getHusband() {
		return husband;
	}
    @Autowired
	public void setHusband(Xuxiao husband) {
		this.husband = husband;
	}
	@Override
	public String toString() {
		return "Rabbit [name=" + name + ", husband=" + husband + "]";
	}	

}
