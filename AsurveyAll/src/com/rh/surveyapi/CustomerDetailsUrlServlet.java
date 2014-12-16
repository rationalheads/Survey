package com.rh.surveyapi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.rh.surveydto.CampaignInfo;
import com.rh.surveydto.CustomerRecord;
import com.rh.surveyjavabean.CreateCampaignJavaBean;
import com.rh.surveyjavabean.SurveyRegistrationJavaBean;


public class CustomerDetailsUrlServlet extends HttpServlet
{
	private static final long serialVersionUID = 8610051237654068698L;
	int camp_id;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		doGet(req,res);
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/plain");
		PrintWriter out = res.getWriter();
		String action=req.getParameter("action");
		
		if(action.equals("log"))
		{
			String username=req.getParameter("f_name");
			String password=req.getParameter("password");
	
			CustomerRecord customerRecord=new CustomerRecord();
			customerRecord.setF_name(username);
			customerRecord.setPassword(password);
			SurveyRegistrationJavaBean javabean=new SurveyRegistrationJavaBean();
			boolean status=javabean.validateCustomerRecord(customerRecord);
			if(status==true)
			{					
					HttpSession ses=req.getSession(true);
					ses.setAttribute("cid", customerRecord.getCust_id());			
					CampaignInfo campaignInfo = new CampaignInfo(camp_id);
					campaignInfo.setCamp_id(camp_id);
					CreateCampaignJavaBean campaignJavaBean=new CreateCampaignJavaBean();
					boolean status1=campaignJavaBean.validateCampaignInfo(campaignInfo);				
					if(status1==true)
					{					
						req.setAttribute("CAMP_DATA",campaignInfo);
						List<String> list = new ArrayList<String>();
						list.add("1");
						list.add(String.valueOf(campaignInfo.getCust_id()));
						list.add(String.valueOf(campaignInfo.getCamp_id()));
						String json = new Gson().toJson(list);
						res.setContentType("application/json");
						res.setCharacterEncoding("UTF-8");
						res.getWriter().write(json);
					}				
			}
			else
			{
				out.write("0");
			}
		}
		else if(action.equals("reg"))
		{
			int cust_id=1;
			String acc_type=req.getParameter("acc_type");
			String f_name=req.getParameter("f_name");
			String l_name=req.getParameter("l_name");
			Long msisdn=Long.parseLong(req.getParameter("msisdn"));
			String emailid=req.getParameter("emailid");
			String password=req.getParameter("password");
			String gender=req.getParameter("gender");
			String marital_status=req.getParameter("marital_status");
			String company_name=req.getParameter("company_name");
			String designation=req.getParameter("designation");
			String business_type=req.getParameter("business_type");
			String address_1=req.getParameter("address_1");
			String address_2=req.getParameter("address_2");
			String locality=req.getParameter("locality");
			String city=req.getParameter("city");
			String country=req.getParameter("country");
			String pin_code=req.getParameter("pin_code");

			CustomerRecord customerRecord=new CustomerRecord(cust_id, acc_type, f_name, l_name, msisdn, emailid, password, gender, marital_status, company_name, designation, business_type, 
				address_1, address_2, locality, city, country, pin_code);
			SurveyRegistrationJavaBean javabean=new SurveyRegistrationJavaBean();
			boolean status=javabean.registerCustomerRecord(customerRecord);
			if(status==true)
			{
				out.write("1");
			}
			else
			{
				out.write("0");
			}
		}
	}
}
