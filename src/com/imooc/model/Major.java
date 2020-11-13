package com.imooc.model;

public class Major {
	private String majorName;
	private String majorCode;
	private int majorYear;
	
	public Major() {
		super();
	}
	public Major(String majorName, String majorCode, int majorYear) {
		super();
		this.setMajorName(majorName);
		this.setMajorYear(majorYear);
		this.setMajorCode(majorCode);
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	public String getMajorCode() {
		return majorCode;
	}
	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}
	public int getMajorYear() {
		return majorYear;
	}
	public void setMajorYear(int majorYear) {
		if(majorYear<=0) {
			return;
		}
		this.majorYear = majorYear;
	}
	@Override
	public String toString() {
		return "Major [majorName=" + majorName + ", majorCode=" + majorCode + ", majorYear=" + majorYear + "]";
	}
	
	

}
