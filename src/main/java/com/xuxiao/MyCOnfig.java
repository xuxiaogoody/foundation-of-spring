package com.xuxiao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.xuxiao.bean.Mea;
//config¿‡µº»Îxml≈‰÷√
@ImportResource(locations="application.xml")
@ComponentScan
@Configuration
public class MyCOnfig {
	@Bean
	public Mea getxuxiao() {
		return new Mea("mea",24);
	}

}
