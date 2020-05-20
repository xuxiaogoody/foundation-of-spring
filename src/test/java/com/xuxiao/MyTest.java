package com.xuxiao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xuxiao.bean.Mea;
import com.xuxiao.bean.Rabbit;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MyCOnfig.class)
public class MyTest {
	@Autowired
	Rabbit r;
	@Autowired
	Mea mea;
	@Test
	public void test() {
		System.out.println(r.toString());
		System.out.println(mea.toString());
	}

}
