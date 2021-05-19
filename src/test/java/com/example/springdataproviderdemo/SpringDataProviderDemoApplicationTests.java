package com.example.springdataproviderdemo;

import com.example.springdataproviderdemo.entity.Pen;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootTest
class SpringDataProviderDemoApplicationTests {

	@Test
	void contextLoads() {
		ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
		Pen pen = (Pen)context.getBean("pen");
		System.out.println(pen.getId());
	}

}
