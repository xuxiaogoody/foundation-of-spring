package com.xuxiao.factory;

import com.xuxiao.beans.Leffry;
import com.xuxiao.beans.Xuxiao;

/**
 * 测试工厂非静态方法创建对象
 * @author xuxiao
 *
 */
public class SimpleFactory {
	public Leffry getBean() {
		return new Leffry("拉菲", 14, new Xuxiao("徐笑",18));
	}
	

}
