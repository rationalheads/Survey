package com.rh.surveyutility;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility 
{	
	public static SessionFactory sessionfactory;
	
	public static SessionFactory getSessionFactory() throws HibernateException
	{
		try
		{
			Configuration cfg=new Configuration();
			cfg.configure("com/rh/surveyutility/hibernate.cfg.xml");
			sessionfactory=cfg.buildSessionFactory();			
		}
		catch(Exception he)
		{
			System.out.println("hi error in configuration of hibernate");
			he.printStackTrace();
		}
		return sessionfactory;
	}
	
}