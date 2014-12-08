package com.rh.surveydto;


public class QuestionOptions
{
	private int option_id;
	private int section_id;
	private String option_1;
	private String option_2;
	private String option_3;
	private String option_4;
	private String option_5;
	private String option_6;
	private String option_7;
	private String option_8;
	
	QuestionOptionsID questionOptionsID;
	public QuestionOptions()
	{
		
	}

	public QuestionOptions(int option_id, int section_id,
			String option_1, String option_2, String option_3, String option_4,
			String option_5, String option_6, String option_7, String option_8, QuestionOptionsID questionOptionsID)
	{
		super();
		this.option_id = option_id;
		this.section_id = section_id;
		this.option_1 = option_1;
		this.option_2 = option_2;
		this.option_3 = option_3;
		this.option_4 = option_4;
		this.option_5 = option_5;
		this.option_6 = option_6;
		this.option_7 = option_7;
		this.option_8 = option_8;
		this.questionOptionsID=questionOptionsID;
	}

	public int getOption_id() {
		return option_id;
	}

	public void setOption_id(int option_id) {
		this.option_id = option_id;
	}

	public int getSection_id() {
		return section_id;
	}

	public void setSection_id(int section_id) {
		this.section_id = section_id;
	}

	public String getOption_1() {
		return option_1;
	}

	public void setOption_1(String option_1) {
		this.option_1 = option_1;
	}

	public String getOption_2() {
		return option_2;
	}

	public void setOption_2(String option_2) {
		this.option_2 = option_2;
	}

	public String getOption_3() {
		return option_3;
	}

	public void setOption_3(String option_3) {
		this.option_3 = option_3;
	}

	public String getOption_4() {
		return option_4;
	}

	public void setOption_4(String option_4) {
		this.option_4 = option_4;
	}

	public String getOption_5() {
		return option_5;
	}

	public void setOption_5(String option_5) {
		this.option_5 = option_5;
	}

	public String getOption_6() {
		return option_6;
	}

	public void setOption_6(String option_6) {
		this.option_6 = option_6;
	}

	public String getOption_7() {
		return option_7;
	}

	public void setOption_7(String option_7) {
		this.option_7 = option_7;
	}

	public String getOption_8() {
		return option_8;
	}

	public void setOption_8(String option_8) {
		this.option_8 = option_8;
	}

	public QuestionOptionsID getQuestionOptionsID() {
		return questionOptionsID;
	}

	public void setQuestionOptionsID(QuestionOptionsID questionOptionsID) {
		this.questionOptionsID = questionOptionsID;
	}
	

}
