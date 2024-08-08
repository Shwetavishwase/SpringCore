package com.csi.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Student bean =(Student) context.getBean("stud");
		Student bean1 =(Student) context.getBean("stud");
		Student bean2 =(Student) context.getBean("stud");
		
		System.out.println("Student got called");
		
	}
}
