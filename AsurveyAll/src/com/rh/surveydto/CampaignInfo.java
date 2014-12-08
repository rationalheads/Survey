package com.rh.surveydto;

public class CampaignInfo
{
	private int camp_id;
	private int cust_id;
	private String camp_name;
	private String camp_image;
	private String camp_header;
	private String camp_st_page_text;
	private String camp_type;
	private String level_flag;
	private int default_level;
	private String qualify_cretirion;
	private int qualify_q_count;
	private String success_text;
	private String failure_text;
	
	public CampaignInfo()
	{
		
	}

	public CampaignInfo(int camp_id, int cust_id, String camp_name,
			String camp_image, String camp_header, String camp_st_page_text,
			String camp_type, String level_flag, int default_level,
			String qualify_cretirion, int qualify_q_count,
			String success_text, String failure_text)
	{
		super();
		this.camp_id = camp_id;
		this.cust_id = cust_id;
		this.camp_name = camp_name;
		this.camp_image = camp_image;
		this.camp_header = camp_header;
		this.camp_st_page_text = camp_st_page_text;
		this.camp_type = camp_type;
		this.level_flag = level_flag;
		this.default_level = default_level;
		this.qualify_cretirion = qualify_cretirion;
		this.qualify_q_count = qualify_q_count;
		this.success_text = success_text;
		this.failure_text = failure_text;
	}

	public int getCamp_id() {
		return camp_id;
	}

	public void setCamp_id(int camp_id) {
		this.camp_id = camp_id;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCamp_name() {
		return camp_name;
	}

	public void setCamp_name(String camp_name) {
		this.camp_name = camp_name;
	}

	public String getCamp_image() {
		return camp_image;
	}

	public void setCamp_image(String camp_image) {
		this.camp_image = camp_image;
	}

	public String getCamp_header() {
		return camp_header;
	}

	public void setCamp_header(String camp_header) {
		this.camp_header = camp_header;
	}

	public String getCamp_st_page_text() {
		return camp_st_page_text;
	}

	public void setCamp_st_page_text(String camp_st_page_text) {
		this.camp_st_page_text = camp_st_page_text;
	}

	public String getCamp_type() {
		return camp_type;
	}

	public void setCamp_type(String camp_type) {
		this.camp_type = camp_type;
	}

	public String getLevel_flag() {
		return level_flag;
	}

	public void setLevel_flag(String level_flag) {
		this.level_flag = level_flag;
	}

	public int getDefault_level() {
		return default_level;
	}

	public void setDefault_level(int default_level) {
		this.default_level = default_level;
	}

	public String getQualify_cretirion() {
		return qualify_cretirion;
	}

	public void setQualify_cretirion(String qualify_cretirion) {
		this.qualify_cretirion = qualify_cretirion;
	}

	public int getQualify_q_count() {
		return qualify_q_count;
	}

	public void setQualify_q_count(int qualify_q_count) {
		this.qualify_q_count = qualify_q_count;
	}

	public String getSuccess_text() {
		return success_text;
	}

	public void setSuccess_text(String success_text) {
		this.success_text = success_text;
	}

	public String getFailure_text() {
		return failure_text;
	}

	public void setFailure_text(String failure_text) {
		this.failure_text = failure_text;
	}
	

}
