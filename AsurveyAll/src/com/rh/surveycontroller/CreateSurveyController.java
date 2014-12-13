package com.rh.surveycontroller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.rh.surveydto.CampaignInfo;
import com.rh.surveyjavabean.CreateCampaignJavaBean;

public class CreateSurveyController extends HttpServlet 
{
	HashMap<String, String> hm = new HashMap<String, String>();
	private static final long serialVersionUID = 1L;
	private final String UPLOAD_DIRECTORY = "C:/data";
	String custid;
	String campid;
	String campimage;
	String campname;    					
	String campheader;
	String campstpagetext;
	String camptype;
	String levelflag;
	String defaultlevel;
	String qualifycretirion;
	String qualifyqcount;
	String successtext;
	String failuretext;	
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
	 String action=request.getParameter("action");
	 HttpSession ses= request.getSession();
	 custid =ses.getAttribute("cid").toString();
	 campid="001";

	//String campid =request.getParameter("camp_id").toString();
	 
	 if(action.equals("cre"))
	 {
	   if(ServletFileUpload.isMultipartContent(request)==true)
	   {		
		  try {
               List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
               for(FileItem item : multiparts)
               {            	   	
            	   
                   if(!item.isFormField())
                   {                                              
                       String fname = new File(item.getName()).getName();                                             
                       System.out.println(fname);
                       String fileExtention =   fname.substring(fname.lastIndexOf('.'));
                       String newfname = new StringBuffer(String.valueOf("Img_")).append(custid).append('_').append(campid).toString();
                       campimage = new StringBuffer().append(newfname).append(fileExtention).toString();                        
                       File uploadfile =  new File(UPLOAD_DIRECTORY + File.separator + campimage);
                       item.write(uploadfile);
                   }
                   else
                   {
                	   hm.put(item.getFieldName(), item.getString());                	   
                   }
               } 
               	int camp_id=Integer.parseInt(campid);
               	int cust_id=Integer.parseInt(custid);
               	String camp_image=campimage;
          	 	String camp_name = (String)hm.get("campname");
          	 	String camp_header= (String)hm.get("campheader");
          	 	String camp_st_page_text= (String)hm.get("campstpagetext");
          	 	String camp_type= (String)hm.get("camptype");
          	 	String level_flag= (String)hm.get("levelflag");
          	 	int default_level=Integer.parseInt((String)hm.get("defaultlevel"));
          	 	String qualify_cretirion= (String)hm.get("qualifycretirion");
          	 	int qualify_q_count=Integer.parseInt((String)hm.get("qualifyqcount"));
          		String success_text=(String)hm.get("successtext");
          		String failure_text=(String)hm.get("failuretext");
          		CampaignInfo campaignInfo = new CampaignInfo(camp_id, cust_id, camp_name, camp_image, camp_header, camp_st_page_text, camp_type, level_flag, default_level, qualify_cretirion, qualify_q_count, success_text, failure_text); 
                CreateCampaignJavaBean createCampaignJavaBean =new CreateCampaignJavaBean();
                boolean status = createCampaignJavaBean.registerCampaignInfo(campaignInfo);               
                if(status==true)
                {
             	   getServletConfig().getServletContext().getRequestDispatcher("/RegistrationSuccess.jsp").forward(request,response);
                }
                else
                {				
             	   getServletConfig().getServletContext().getRequestDispatcher("/RegistrationFailure.jsp").forward(request,response);		
                }
               
		  	}
		  	catch (Exception ex)
		  	{
			  new ServletException("Servlet Exception:"+ex.getMessage());
      	    }		
	   }
	   else
      {
		   request.setAttribute("message", "Sorry this Servlet only handles file upload request");
		   return;
       }     
      
	 }
	 else
	 {
		 getServletConfig().getServletContext().getRequestDispatcher("/createsurvey.jsp").forward(request,response);
	 }
   }

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException
   {
	   // TODO Auto-generated method stub
	   super.doPost(request, response);
   }
 
}
