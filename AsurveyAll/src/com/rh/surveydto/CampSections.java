package com.rh.surveydto;

public class CampSections
{
	private int section_id;
	private int camp_id;
	private String section_name;
	private String section_header;
	private String section_image;
	
	public CampSections()
	{
		
	}
	public CampSections(int section_id, int camp_id, String section_name, String section_header, String section_image)
	{
		super();
		this.section_id = section_id;
		this.camp_id = camp_id;
		this.section_name = section_name;
		this.section_header = section_header;
		this.section_image = section_image;
	}
	public int getSection_id() {
		return section_id;
	}
	public void setSection_id(int section_id) {
		this.section_id = section_id;
	}
	public int getCamp_id() {
		return camp_id;
	}
	public void setCamp_id(int camp_id) {
		this.camp_id = camp_id;
	}
	public String getSection_name() {
		return section_name;
	}
	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}
	public String getSection_header() {
		return section_header;
	}
	public void setSection_header(String section_header) {
		this.section_header = section_header;
	}
	public String getSection_image() {
		return section_image;
	}
	public void setSection_image(String section_image) {
		this.section_image = section_image;
	}	
}
	