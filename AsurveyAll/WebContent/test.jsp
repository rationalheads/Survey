<%@ page import="com.rh.surveydto.CustomerRecord" %>

<%
	CustomerRecord customerRecord=(CustomerRecord)request.getAttribute("EMP_DATA");
%>
	<h2>
	<font color="green">
		Welcome <%= customerRecord.getF_name() %>
	</font>
	</h2>
	<br>Cust_Id : <%= customerRecord.getCust_id() %>
	<br>Acc_Type : <%= customerRecord.getAcc_type() %>
	<br>L_Name : <%= customerRecord.getL_name() %>
	<br>MSISDN : <%= customerRecord.getMsisdn() %>
	<br>EmailId : <%= customerRecord.getEmailid() %>
	<br>Password : <%= customerRecord.getPassword() %>
	<br>Gender : <%= customerRecord.getGender() %>
	<br>Marital_Status : <%= customerRecord.getMarital_status() %>
	<br>Company_Name : <%= customerRecord.getCompany_name() %>
	<br>Designation : <%= customerRecord.getDesignation() %>
	<br>Business_Type : <%= customerRecord.getBusiness_type() %>
	<br>Address_1 : <%= customerRecord.getAddress_1() %>
	<br>Address_2 : <%= customerRecord.getAddress_2() %>
	<br>Locality : <%= customerRecord.getLocality() %>
	<br>City : <%= customerRecord.getCity() %>
	<br>Country : <%= customerRecord.getCountry() %>
	<br>Pin_Code : <%= customerRecord.getPin_code() %>