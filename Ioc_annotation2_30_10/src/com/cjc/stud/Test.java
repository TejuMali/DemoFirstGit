package com.cjc.stud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args)

	{
System.out.println("Github");

		ApplicationContext aps=new AnnotationConfigApplicationContext(configuration.class);
		Student studd=(Student) aps.getBean("x");
		System.out.println("Student Roll no:"+studd.getRollno());
		System.out.println("Student name:"+studd.getName());
		System.out.println("Student Address:"+studd.getAddress());
	}

}
