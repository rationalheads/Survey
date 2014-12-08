package com.rh.surveydto;


public class QuestionDetails
{
	
	private int qid;
	private int camp_id;
	private int section_id;
	private String question;
	private String level;
	private String choice_type;
	private String question_type;
	private String question_image;
	private String ismandatory;
	private String next_qid;
	
	QuestionDetailsID questionDetailsID;
	
	public QuestionDetails()
	{
		
	}

	public QuestionDetails(int qid, int camp_id, int section_id, String question, String level, String choice_type,
			String question_type, String question_image, String ismandatory,
			String next_qid, QuestionDetailsID questionDetailsID)
	{
		super();
		this.qid = qid;
		this.camp_id=camp_id;
		this.section_id=section_id;
		this.question = question;
		this.level = level;
		this.choice_type = choice_type;
		this.question_type = question_type;
		this.question_image = question_image;
		this.ismandatory = ismandatory;
		this.next_qid = next_qid;
		this.questionDetailsID=questionDetailsID;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}


	public int getCamp_id() {
		return camp_id;
	}

	public void setCamp_id(int camp_id) {
		this.camp_id = camp_id;
	}

	public int getSection_id() {
		return section_id;
	}

	public void setSection_id(int section_id) {
		this.section_id = section_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getChoice_type() {
		return choice_type;
	}

	public void setChoice_type(String choice_type) {
		this.choice_type = choice_type;
	}

	public String getQuestion_type() {
		return question_type;
	}

	public void setQuestion_type(String question_type) {
		this.question_type = question_type;
	}

	public String getQuestion_image() {
		return question_image;
	}

	public void setQuestion_image(String question_image) {
		this.question_image = question_image;
	}

	public String getIsmandatory() {
		return ismandatory;
	}

	public void setIsmandatory(String ismandatory) {
		this.ismandatory = ismandatory;
	}

	public String getNext_qid() {
		return next_qid;
	}

	public void setNext_qid(String next_qid) {
		this.next_qid = next_qid;
	}

	public QuestionDetailsID getQuestionDetailsID() {
		return questionDetailsID;
	}

	public void setQuestionDetailsID(QuestionDetailsID questionDetailsID) {
		this.questionDetailsID = questionDetailsID;
	}
	
}
