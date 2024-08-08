package com.csi.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Student student = (Student) context.getBean("stud");
		
		System.out.println(student);
		
		
	}
}
