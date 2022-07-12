package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main 
{
	public static void main(String[] args) 
	{
		Configuration cf =new   Configuration();
		cf.configure("hibernate.xml");
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.xml").build();  
         
		   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		  
		SessionFactory sf =meta.getSessionFactoryBuilder().build();  
		Session se = sf.openSession();
		Transaction tx =se.beginTransaction();
		Student satya = new Student();
		satya.setId(996);
		satya.setName("sandeep");
		satya.setMarks(234);
		
	    se.saveOrUpdate(satya);
		tx.commit();
		se.close();
		
	}

}
