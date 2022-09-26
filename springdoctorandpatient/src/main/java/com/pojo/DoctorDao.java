package com.pojo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;


public class DoctorDao 
{
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		
	}
	
	public void save(Doctordata data)
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(data);
		tx.commit();
		session.close();
	}
	

}
