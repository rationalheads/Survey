package com.rh.surveydao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rh.surveydto.CampaignInfo;
import com.rh.surveyutility.Utility;

public class CreateCampaignDao
{
	public static SessionFactory sfactory=Utility.getSessionFactory();
	
	//database access methods
		public boolean searchCampaignRecord(CampaignInfo campaignInfo)
		{
			boolean status=false;
			Session session=null;
			
			try
			{
				session=sfactory.openSession();
				
				String hql="select max(ci.camp_id) from CampaignInfo ci";
				Query query=session.createQuery(hql);
				List list=query.list();
				ArrayList al=new ArrayList(list);
				System.out.println(al.size());
				if(al.size()==0)
				{										
					int camp_id=1;
					campaignInfo.setCamp_id(camp_id);
					status=true;
				}
				else if(al.size()>0)
				{
					int cid = (int) al.get(0);
					if(cid>0)
					{
						cid=cid+1;						
						campaignInfo.setCamp_id(cid);
					}
					status=true;
				}
				else
					campaignInfo=null;
			}
			catch(HibernateException he)
			{
				he.printStackTrace();
				campaignInfo=null;
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
					campaignInfo=null;
				}
			}
			
			return status;
		}
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
