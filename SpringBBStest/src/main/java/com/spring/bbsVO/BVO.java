package com.spring.bbsVO;

import java.security.Timestamp;

public class BVO {
	private int bNo;
	private String bName;
	private String bSubject;
	private String bContent;
	private Timestamp bDate;
	private int bHit;
	private int bGroup;
	private int bStep;
	private int bIndent;
	
	public BVO() {
	}
		
	public BVO(int bNo, String bName, String bSubject, String bContent, Timestamp bDate, int bHit, int bGroup,
			int bStep, int bIndent) {
		super();
		this.bNo = bNo;
		this.bName = bName;
		this.bSubject = bSubject;
		this.bContent = bContent;
		this.bDate = bDate;
		this.bHit = bHit;
		this.bGroup = bGroup;
		this.bStep = bStep;
		this.bIndent = bIndent;
	}
	
	public int getbNo() {
		return bNo;
	}
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbSubject() {
		return bSubject;
	}
	public void setbSubject(String bSubject) {
		this.bSubject = bSubject;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public Timestamp getbDate() {
		return bDate;
	}
	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}
	public int getbHit() {
		return bHit;
	}
	public void setbHit(int bHit) {
		this.bHit = bHit;
	}
	public int getbGroup() {
		return bGroup;
	}
	public void setbGroup(int bGroup) {
		this.bGroup = bGroup;
	}
	public int getbStep() {
		return bStep;
	}
	public void setbStep(int bStep) {
		this.bStep = bStep;
	}
	public int getbIndent() {
		return bIndent;
	}
	public void setbIndent(int bIndent) {
		this.bIndent = bIndent;
	}
	
	@Override
	public String toString() {
		return "BVO [bNo=" + bNo + ", bName=" + bName + ", bSubject=" + bSubject + ", bContent=" + bContent + ", bDate="
				+ bDate + ", bHit=" + bHit + ", bGroup=" + bGroup + ", bStep=" + bStep + ", bIndent=" + bIndent + "]";
	}
	
}
