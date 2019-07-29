package com.javalec.bmiEx;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		//xml-based DI
		String configLocation = "classpath:applicationCTX.xml";	
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);	//create a spring container	
		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);	//get bean (components) from the container.
		
		myInfo.getInfo();
		ctx.close();
	}

}
