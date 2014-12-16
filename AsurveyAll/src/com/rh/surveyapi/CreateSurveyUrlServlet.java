package com.rh.surveyapi;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
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
	HashMap<String, String> hm = new HashMap<String, String>();
	private static final long serialVersionUID = 1L;
	private final String UPLOAD_DIRECTORY = "C:/data";
	String custid;
	String campid;
	String campimage;		
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
	   PrintWriter out = response.getWriter();
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
         		
               	System.out.println("HashMap:"+hm);
               	System.out.println("cust_id:"+cust_id);
               	System.out.println("camp_id:"+camp_id);
               	System.out.println("camp_image:"+camp_image);
               	System.out.println("camp_name:"+camp_name);
               	System.out.println("camp_header:"+camp_header);
               	System.out.println("camp_st_page_text:"+camp_st_page_text);
               	System.out.println("camp_type:"+camp_type);
               	System.out.println("level_flag:"+level_flag);
               	System.out.println("default_level:"+default_level);
               	System.out.println("qualify_cretirion:"+qualify_cretirion);
               	System.out.println("qualify_q_count:"+qualify_q_count);
               	System.out.println("success_text:"+success_text);
               	System.out.println("failure_text:"+failure_text);
         		CampaignInfo campaignInfo = new CampaignInfo(camp_id, cust_id, camp_name, camp_image, camp_header, camp_st_page_text, camp_type, level_flag, default_level, qualify_cretirion, qualify_q_count, success_text, failure_text); 
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