package com.xuxiao.xml≈‰÷√≤‚ ‘;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xuxiao.beans.Leffry;
import com.xuxiao.beans.Lem;
import com.xuxiao.beans.Miku;
import com.xuxiao.beans.MyWifes;
import com.xuxiao.beans.Xuxiao;

public class xml≈‰÷√≤‚ ‘ {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
	    Xuxiao xu = (Xuxiao) ac.getBean("xuxiao");
	    System.out.println(xu.getClass().getName());
	    System.out.println(xu.toString());
	    
	    Miku mi = (Miku)ac.getBean("miku");
	    System.out.println(mi.toString());
	    
	    Lem lem = (Lem) ac.getBean("lem");
	    System.out.println(lem.toString());
	    
	    Leffry leffry = (Leffry) ac.getBean("leffry");
	    System.out.println(leffry.toString());
	    
	    MyWifes wifes = (MyWifes) ac.getBean("wifes");
	    System.out.println(wifes.toString());
	}

}
