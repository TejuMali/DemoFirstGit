package com.cjc.stud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configuration
{
	@Bean(name="x")
	public Student getStudent()
	{
		Student stud=new Student();
		stud.setRollno(1);
		stud.setName("Abc");
		stud.setAddress("Pune");
		return stud;
		
	}
	

}
