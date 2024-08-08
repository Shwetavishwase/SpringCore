package com.csi.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("beans.xml");
		
		BeanFactory bFactory=new XmlBeanFactory(resource);
		
		Student bean =(Student) bFactory.getBean("stud");
		Student bean1 =(Student) bFactory.getBean("stud");
		Student bean2 =(Student) bFactory.getBean("stud");
		
		System.out.println("Student got called");
		
	}
}
