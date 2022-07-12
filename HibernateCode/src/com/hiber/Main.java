package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main 
{
	public static void main(String[] args) 
	{
		Configuration cf =new   Configuration();
		cf.configure("hibernate.xml");
		
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx =se.beginTransaction();
		Student maheswri = new Student();
		maheswri.setId(99);
		maheswri.setName("maheswari");
		maheswri.setMarks(998);
		se.update(maheswri);
		tx.commit();
		se.close();
		
	}

}
