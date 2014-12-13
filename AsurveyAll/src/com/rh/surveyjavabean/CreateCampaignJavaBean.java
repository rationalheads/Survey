package com.rh.surveyjavabean;

import com.rh.surveydao.CreateCampaignDao;
import com.rh.surveydto.CampaignInfo;

public class CreateCampaignJavaBean
{
public CreateCampaignDao campaignDao=null;
	
	public CreateCampaignJavaBean()
	{
		try
		{
		campaignDao = new CreateCampaignDao();
		}catch(Exception ex)
		{System.out.println("error in CreateCampaignJavaBean Constructor");}
	}
	//business logic methods
	public boolean validateCampaignInfo(CampaignInfo campaignInfo)
	{
		boolean status=false;
		status=campaignDao.searchCampaignRecord(campaignInfo);
		return status;
	}
	
	public boolean registerCampaignInfo(CampaignInfo campaignInfo)
	{
		boolean status=false;
	
		status=campaignDao.insertCampaignInfo(campaignInfo);

		return status;
	}
}
