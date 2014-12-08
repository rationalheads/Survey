package com.rh.surveydto;

import java.io.Serializable;

public class QuestionDetailsID implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int qid;
	private int camp_id;
	private int section_id;
	
	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public QuestionDetailsID()
	{
		super();	
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
	
	/*@Override
	public boolean equals(Object args0)
	{
		if(args0==null) return false;
		if(!(args0 instanceof QuestionDetailsID)) return false;
		QuestionDetailsID args1=(QuestionDetailsID) args0;
		return (this.camp_id.intValue() == args1.getCamp_id().intValue()) && (this.section_id.intValue() == args1.getSection_id().intValue());
	}
	@Override
	public int hashCode()
	{
	int hsCode;
	hsCode = camp_id.hashCode();
	hsCode = 19 * hsCode+ section_id.hashCode();
	return hsCode;
	}*/
}
