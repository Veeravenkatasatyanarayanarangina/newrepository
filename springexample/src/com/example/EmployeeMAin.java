package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeMAin 
{
	public static void main(String[] args) {
		//Resource res = new ClassPathResource("spring.xml");
		//BeanFactory factory = new XmlBeanFactory(res);
		ApplicationContext context =  new FileSystemXmlApplicationContext ("D:/Myrepository/newrepository/springexample/src/spring.xml");
		
		Employee emp = (Employee)context.getBean("satya");
		System.out.println(emp.getEid()+"  "+emp.getEname()+" "+emp.getEphone());
	}

}
