package com.rh.surveyjavabean;

import com.rh.surveydao.SurveyRegistrationDao;
import com.rh.surveydto.CustomerRecord;

public class SurveyRegistrationJavaBean
{
	public SurveyRegistrationDao surveyDao=null;
	
	public SurveyRegistrationJavaBean()
	{
		try
		{
		surveyDao=new SurveyRegistrationDao();
		}catch(Exception ex)
		{System.out.println("error in SurveyJavaBean Constructor");}
	}
	//business logic methods
	public boolean validateCustomerRecord(CustomerRecord customerRecord)
	{
		boolean status=false;
		status=surveyDao.searchCustomerRecordByUsernameAndPassword(customerRecord);
		return status;
	}
	public boolean registerCustomerRecord(CustomerRecord customerRecord)
	{
		boolean status=false;
	
		status=surveyDao.insertCustomerRecord(customerRecord);

		return status;
	}
	
}
