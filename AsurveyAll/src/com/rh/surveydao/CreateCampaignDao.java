package com.rh.surveydao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rh.surveydto.CampaignInfo;
import com.rh.surveyutility.Utility;

public class CreateCampaignDao
{
	public static SessionFactory sfactory=Utility.getSessionFactory();
	public boolean insertCampaignInfo(CampaignInfo campaignInfo)
	{
		boolean status=false;
		
		Session session=null;
		
		try
		{
			session=sfactory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(campaignInfo);			
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
