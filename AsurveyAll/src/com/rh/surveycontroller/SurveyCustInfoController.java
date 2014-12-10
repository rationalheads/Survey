package com.rh.surveycontroller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rh.surveydto.CustomerRecord;
import com.rh.surveyjavabean.SurveyRegistrationJavaBean;

public class SurveyCustInfoController extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException	
	{
		super.init(config);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		doPost(req,res);
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		
		String action=req.getParameter("action");
		
		if(action.equals("lform"))
		{
			getServletConfig().getServletContext().getRequestDispatcher("/signin.jsp").forward(req,res);
		}
		else if(action.equals("rform"))
		{
			getServletConfig().getServletContext().getRequestDispatcher("/signup.jsp").forward(req,res);
		}
		else if(action.equals("log"))
		{
			String username=req.getParameter("f_name");
			String password=req.getParameter("password");
	
			CustomerRecord customerRecord=new CustomerRecord();
			customerRecord.setF_name(username);
			customerRecord.setPassword(password);
			SurveyRegistrationJavaBean javabean=new SurveyRegistrationJavaBean();
			boolean status=javabean.validateCustomerRecord(customerRecord);
			if(status)
			{
				HttpSession ses=req.getSession(true);
				ses.setAttribute("cid", customerRecord.getCust_id());
				req.setAttribute("CDATA",customerRecord);				
				getServletConfig().getServletContext().getRequestDispatcher("/LoginSuccess.jsp").forward(req,res);
			}
			else
			{
				getServletConfig().getServletContext().getRequestDispatcher("/LoginFailure.jsp").forward(req,res);
			}
		}
		else if(action.equals("reg"))
		{
			int cust_id=1;
			/*int cust_id=Integer.parseInt(req.getParameter("cust_id"));*/
			String acc_type=req.getParameter("acc_type");
			String f_name=req.getParameter("f_name");
			String l_name=req.getParameter("l_name");
			String ms=req.getParameter("msisdn");
			String ms1 = ms.substring(0, ms.lastIndexOf(""));
			int msisdn=Integer.parseInt(ms1);
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
			System.out.println("before SurveyJavaBean");
			/*SurveyRegistrationJavaBean javabean=new SurveyRegistrationJavaBean();
			boolean status=javabean.registerCustomerRecord(customerRecord);*/
			req.setAttribute("EMP_DATA",customerRecord);
			getServletConfig().getServletContext().getRequestDispatcher("/test.jsp").forward(req,res);
			/*if(status==true)
			{
				getServletConfig().getServletContext().getRequestDispatcher("/RegistrationSuccess.jsp").forward(req,res);
			}
			else
			{				
				getServletConfig().getServletContext().getRequestDispatcher("/RegistrationFailure.jsp").forward(req,res);		
			}*/
		}
	}

}