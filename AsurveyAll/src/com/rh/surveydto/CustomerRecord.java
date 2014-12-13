package com.rh.surveydto;

public class CustomerRecord 
{

	private int cust_id;
	private String acc_type;
	private String f_name;
	private String l_name;
	private long msisdn;
	private String emailid;
	private String password;
	private String gender;
	private String marital_status;
	private String company_name;
	private String designation;
	private String business_type;
	private String address_1;
	private String address_2;
	private String locality;
	private String city;
	private String country;
	private String pin_code;
	
	public CustomerRecord()
	{		
	}
	public CustomerRecord(int cust_id, String acc_type, String f_name,	String l_name, long msisdn, String emailid, String password,	String gender, String marital_status,
			String company_name, String designation, String business_type, String address_1,	String address_2, String locality, String city, String country, String pin_code)
	{
		super();
		this.cust_id = cust_id;
		this.acc_type = acc_type;
		this.f_name = f_name;
		this.l_name = l_name;
		this.msisdn = msisdn;
		this.emailid = emailid;
		this.password = password;
		this.gender = gender;
		this.marital_status = marital_status;
		this.company_name = company_name;
		this.designation = designation;
		this.business_type = business_type;
		this.address_1 = address_1;
		this.address_2 = address_2;
		this.locality = locality;
		this.city = city;
		this.country = country;
		this.pin_code = pin_code;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public long getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(long msisdn) {
		this.msisdn = msisdn;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getBusiness_type() {
		return business_type;
	}
	public void setBusiness_type(String business_type) {
		this.business_type = business_type;
	}
	public String getAddress_1() {
		return address_1;
	}
	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}
	public String getAddress_2() {
		return address_2;
	}
	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPin_code() {
		return pin_code;
	}
	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}
	
}
