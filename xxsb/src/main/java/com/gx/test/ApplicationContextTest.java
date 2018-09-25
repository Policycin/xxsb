package com.gx.test;

import javax.activation.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
	private ApplicationContext ctx=null;
	
	{
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	
	@Test
	public void textDataSource(){
		DataSource dataSource=ctx.getBean(DataSource.class);
		System.out.println();
	}

}
