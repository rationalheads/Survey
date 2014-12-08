package com.rh.surveycontroller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.rh.surveydto.CampaignInfo;
import com.rh.surveyjavabean.CreateCampaignJavaBean;

/**
 * Servlet implementation class CreateSurveyController
 */
@WebServlet("/CreateSurveyController")
public class CreateSurveyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private boolean isMultipart;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		
		String action=req.getParameter("action");

		 if(action.equals("cre"))
		{
			int camp_id=1;
			int cust_id=Integer.parseInt(req.getParameter("cust_id"));
			String camp_name=req.getParameter("camp_name");
			//String camp_image=req.getParameter("camp_image");			
			String camp_header=req.getParameter("camp_header");
			String camp_st_page_text=req.getParameter("camp_st_page_text");
			String camp_type=req.getParameter("camp_type");
			String level_flag=req.getParameter("level_flag");
			int default_level=Integer.parseInt(req.getParameter("default_level"));
			String qualify_cretirion=req.getParameter("qualify_cretirion");
			int qualify_q_count=Integer.parseInt(req.getParameter("qualify_q_count"));
			String success_text=req.getParameter("success_text");
			String failure_text=req.getParameter("failure_text");
			
			isMultipart = ServletFileUpload.isMultipartContent(req);
			if(isMultipart)
			{
				FileItemFactory factory=new DiskFileItemFactory();
				ServletFileUpload upload=new ServletFileUpload(factory);
				try
				{
					List<FileItem> items=upload.parseRequest(req);
					Iterator<FileItem> iter = items.iterator();
					while (iter.hasNext())
					{  
					  FileItem item = iter.next();   
					  if (item.isFormField())
					  {      
						 processFormField(item);   
					  }
					  else if (!item.isFormField())
					  { 
						  // Process a file upload
					    String fieldName = item.getFieldName();  
					    String fileName = item.getName();   
					    String contentType = item.getContentType(); 
					    boolean isInMemory = item.isInMemory();  
					    long sizeInBytes = item.getSize();

					//here you change the name of the uploaded file and then write it 

					    String dir="./uploadedfiles";
						File uploadedFile = new File(dir , "fileName");   
						item.write(uploadedFile);


					  }
					}
				}
				catch (FileUploadException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
			String camp_image="abc";
			CampaignInfo campaignInfo=new CampaignInfo(camp_id, cust_id, camp_name, camp_image, camp_header, camp_st_page_text, camp_type, level_flag, default_level, qualify_cretirion, qualify_q_count, success_text, failure_text);
			
			System.out.println("befor SurveyJavaBean");
			CreateCampaignJavaBean javaBean=new CreateCampaignJavaBean();
			boolean status=javaBean.registerCampaignInfo(campaignInfo);
			/*req.setAttribute("EMP_DATA",customerRecord);
			RequestDispatcher rd=req.getRequestDispatcher("./test.jsp");
			rd.forward(req,res);*/
			if(status==true)
			{
				//req.setAttribute("EMP_DATA",customerRecord);
				RequestDispatcher rd=req.getRequestDispatcher("./test.jsp");
				//RequestDispatcher rd=req.getRequestDispatcher("./RegistrationSuccess.jsp");
				rd.forward(req,res);	
			}
			else
			{				
				RequestDispatcher rd=req.getRequestDispatcher("./RegistrationFailure.jsp");
				rd.forward(req,res);	
			}
		}
	}

	private void processFormField(FileItem item) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
	
	}

}
