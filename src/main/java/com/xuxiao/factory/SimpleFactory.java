package com.xuxiao.factory;

import com.xuxiao.beans.Leffry;
import com.xuxiao.beans.Xuxiao;

/**
 * ���Թ����Ǿ�̬������������
 * @author xuxiao
 *
 */
public class SimpleFactory {
	public Leffry getBean() {
		return new Leffry("����", 14, new Xuxiao("��Ц",18));
	}
	

}
