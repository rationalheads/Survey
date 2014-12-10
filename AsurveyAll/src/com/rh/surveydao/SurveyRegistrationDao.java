package com.rh.surveydao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.fileupload.FileItem;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rh.surveydto.CustomerRecord;
import com.rh.surveyutility.Utility;

public class SurveyRegistrationDao
{			
	public static SessionFactory sfactory=Utility.getSessionFactory();
		
	//database access methods
	public boolean searchCustomerRecordByUsernameAndPassword(CustomerRecord customerRecord)
	{
		boolean status=false;
		Session session=null;
		
		try
		{
			session=sfactory.openSession();
			
			String hql="from CustomerRecord c where c.f_name='"+customerRecord.getF_name()+"' and c.password='"+customerRecord.getPassword()+"'";
			Query query=session.createQuery(hql);
			List list=query.list();
			ArrayList al=new ArrayList(list);
			System.out.println(al.size());
			if(al.size()!=0)
			{
				CustomerRecord c=(CustomerRecord)al.get(0);
				customerRecord.setCust_id(c.getCust_id());
				customerRecord.setF_name(c.getF_name());
				customerRecord.setL_name(c.getL_name());
				status=true;
			}
			else
				customerRecord=null;
		}
		catch(HibernateException he)
		{
			he.printStackTrace();
			customerRecord=null;
		}
		finally
		{
			try
			{
				if(session!=null)
					session.close();
			}
			catch(HibernateException he)
			{
				he.printStackTrace();
				customerRecord=null;
			}
		}
		
		return status;
	}
	
	public boolean insertCustomerRecord(CustomerRecord customerRecord)
	{
		boolean status=false;	
		Session session=null;
				
		try
		{
			session=sfactory.openSession();
			Transaction tx=session.beginTransaction();
			
			session.save(customerRecord);
			
			tx.commit();
			
			status=true;
		}
		catch(HibernateException he)
		{
			he.printStackTrace();
		}
		finally
		{
			try
			{
				if(session!=null)
					session.close();
			}
			catch(HibernateException he)
			{
				he.printStackTrace();
			}
		}
				
		return status;
	}
	
}
