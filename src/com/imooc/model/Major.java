package com.imooc.model;

public class Major {
	private String majorName;
	private String majorCode;
	private int majorYear;
	private Student[] students;
	private int studentNum;
	
	public Major() {
		super();
	}
	public Major(String majorName, String majorCode, int majorYear) {
		super();
		this.setMajorName(majorName);
		this.setMajorYear(majorYear);
		this.setMajorCode(majorCode);
	}
	
	
	public Student[] getStudents() {
		if(this.students== null) {
			this.students = new Student[200];
		}
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
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
	
	/*
	 * 添加学生，统计总数到studentNum
	 * */
	public void addStudent(Student student) {
		for(int i =0;i<this.getStudents().length;i++) {
			if(students[i]==null) {
				this.students[i] = student;
				this.studentNum=i+1;
				return;
				
			}
		}
		
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	
	

}
