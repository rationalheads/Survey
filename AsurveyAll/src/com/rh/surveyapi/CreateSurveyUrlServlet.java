package com.rh.surveyapi;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.rh.surveydto.CampaignInfo;
import com.rh.surveyjavabean.CreateCampaignJavaBean;

/**
 * Servlet implementation class CreateSurveyUrlServlet
 */
@WebServlet("/CreateSurveyUrlServlet")
public class CreateSurveyUrlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String UPLOAD_DIRECTORY = "C:/data";
   
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
	   response.setContentType("text/plain");
	   PrintWriter out = response.getWriter();
	   String action=request.getParameter("action");
	   if(action.equals("cre"))
	   {
	   if(!ServletFileUpload.isMultipartContent(request)==true)
	   {
		   request.setAttribute("message", "Sorry this Servlet only handles file upload request");
		   return;
	   }
	   else
       {
		  try {
               List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
             
               for(FileItem item : multiparts)
               {
                   if(!item.isFormField())
                   {   
                	   HttpSession ses= request.getSession();
                	   String custid =ses.getAttribute("cid").toString();
                	   String campid="001";
                       //String campid =request.getParameter("camp_id").toString();
                                           
                       String fname = new File(item.getName()).getName();                                             
                       System.out.println(fname);
                       String fileExtention =   fname.substring(fname.lastIndexOf('.'));
                       String newfname = new StringBuffer(String.valueOf("Img_")).append(custid).append('_').append(campid).toString();
                       String camp_image = new StringBuffer().append(newfname).append(fileExtention).toString();                        
                       File uploadfile =  new File(UPLOAD_DIRECTORY + File.separator + camp_image);
                       item.write(uploadfile);
                       System.out.println(camp_image);
                       
                       int cust_id=Integer.parseInt(custid);
                       int camp_id=Integer.parseInt(campid);
                       System.out.println(cust_id);
                       System.out.println(camp_id);
                       /*String camp_name=request.getParameter("camp_name");           					
                       String camp_header=request.getParameter("camp_header");
                       String camp_st_page_text=request.getParameter("camp_st_page_text");
                       String camp_type=request.getParameter("camp_type");
                       String level_flag=request.getParameter("level_flag");
                       int default_level=Integer.parseInt(request.getParameter("default_level"));
                       String qualify_cretirion=request.getParameter("qualify_cretirion");
                       int qualify_q_count=Integer.parseInt(request.getParameter("qualify_q_count"));
                       String success_text=request.getParameter("success_text");
                       String failure_text=request.getParameter("failure_text");*/
                	   
                       System.out.println("campaininfo object");
                       
                       
                       CampaignInfo campaignInfo = new CampaignInfo(camp_id); //(, cust_id, camp_name, camp_image, camp_header, camp_st_page_text, camp_type, level_flag, default_level, qualify_cretirion, qualify_q_count, success_text, failure_text); 
                       CreateCampaignJavaBean createCampaignJavaBean =new CreateCampaignJavaBean();
                       boolean status = createCampaignJavaBean.registerCampaignInfo(campaignInfo);
                       
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
		  	catch (Exception ex)
		  	{
			  new ServletException("Servlet Exception:"+ex.getMessage());
      	    }        
       }     
      
	 }
	 else
	 {
		 out.write("0");
	 }
   }

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException
   {
	   // TODO Auto-generated method stub
	   super.doPost(request, response);
   }
}