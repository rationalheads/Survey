package com.rh.surveydto;

public class Tragetbaseinfo
{
	private int camp_id;
	private String camp_name;
	private String gender;
	private String age;
	private String occupation;
	private String location;
	private String city;
	private String annual_income;
	
	public Tragetbaseinfo()
	{
		
	}

	public Tragetbaseinfo(int camp_id, String camp_name, String gender,	String age, String occupation, String location, String city, String annual_income)
	{
		super();
		this.camp_id = camp_id;
		this.camp_name = camp_name;
		this.gender = gender;
		this.age = age;
		this.occupation = occupation;
		this.location = location;
		this.city = city;
		this.annual_income = annual_income;
	}

	public int getCamp_id() {
		return camp_id;
	}

	public void setCamp_id(int camp_id) {
		this.camp_id = camp_id;
	}

	public String getCamp_name() {
		return camp_name;
	}

	public void setCamp_name(String camp_name) {
		this.camp_name = camp_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAnnual_income() {
		return annual_income;
	}

	public void setAnnual_income(String annual_income) {
		this.annual_income = annual_income;
	}
}
