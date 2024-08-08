package com.csi.secondary;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		College college = (College) context.getBean("college");
		
		System.out.println(college.address);
		System.out.println("----------------------------");
		System.out.println(college.student.list);
		System.out.println("----------------------------");
		System.out.println(college.student.set);
		System.out.println("----------------------------");
		System.out.println(college.student.map);
		
		System.out.println("*****************************************");
		
		Student student = (Student) context.getBean("stud");
		
//		List
		List<Integer> list = student.getList();
		list.forEach(System.out::println);
		System.out.println("----------------------------------------");
		
//		Set
		Set<String> set = student.getSet();
		set.forEach(System.out::println);
		System.out.println("------------------------------------------");
		
//		Map
		Map<Integer, String> map = student.getMap();
		Set<Integer> keySet = map.keySet();
		for(Integer key:keySet)
		{
			String value = map.get(key);
			System.out.println(key+":"+value);
		}
	}
}
