<%@ page import="java.util.List,java.util.Iterator,java.io.File,org.apache.commons.fileupload.FileItem,org.apache.commons.fileupload.servlet.ServletFileUpload,org.apache.commons.fileupload.FileItemFactory,org.apache.commons.fileupload.disk.DiskFileItemFactory" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<% 
	boolean isMultipart = ServletFileUpload.isMultipartContent(request);
	if(isMultipart)
	{
		FileItemFactory factory=new DiskFileItemFactory();
		ServletFileUpload upload=new ServletFileUpload(factory);
		List<FileItem> items=upload.parseRequest(request);
		
		Iterator<FileItem> iter=items.iterator();
		while(iter.hasNext()) 
		{
		    FileItem item=(FileItem)iter.next();

		    if(item.isFormField()) 
		    {
		    	String name=item.getFieldName();
		        String value=item.getString();
		        out.println("Parameter Name = "+name);
		        out.println("<br>Parameter Value = "+value);

		    } 
		    else 
		    {
		    	String fieldName=item.getFieldName();
		    	out.println("<br>Parameter Name : "+fieldName);
		        String fileName = item.getName();
		        out.println("<br>File Name : "+fileName);
		        String contentType = item.getContentType();
		        out.println("<br>Content Type : "+contentType);
		        boolean isInMemory = item.isInMemory();
		        out.println("<br>Is in memory : "+isInMemory);
		        long sizeInBytes = item.getSize();
		        out.println("<br>Size in bytes : "+sizeInBytes);
		        	
		        File file=new File("./uploadedfiles/"+fileName);
		        item.write(file);
		    }
		}
	}
%>
</body>
</html>