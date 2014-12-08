package com.rh.surveydto;

import java.io.Serializable;

public class QuestionOptionsID implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int qid;
	private int camp_id;
	public QuestionOptionsID(int qid, int camp_id) {
		super();
		this.qid = qid;
		this.camp_id = camp_id;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
