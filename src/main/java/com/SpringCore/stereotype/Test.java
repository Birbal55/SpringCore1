package com.SpringCore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/SpringCore/stereotype/stereo_config.xml");
		
//		Student student = con.getBean("student",Student.class);
		Student student = con.getBean("ob",Student.class);
//		System.out.println(student.hashCode());
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass().getName());
		Student student2 = con.getBean("ob",Student.class);
//		System.out.println(student2.hashCode());
		
		Teacher t1 = con.getBean("teacher",Teacher.class);
		Teacher t2 = con.getBean("teacher",Teacher.class);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
