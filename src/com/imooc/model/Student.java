package com.imooc.model;

public class Student {
	private String StudentName;
	private String StudentNo;
	private String StudentNSex;
	private int StudentAge;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String studentName, String studentNo, String studentNSex, int studentAge) {
		super();
		this.setStudentAge(studentAge);
		this.setStudentName(studentName);
		this.setStudentNo(studentNo);
		this.setStudentNSex(studentNSex);
	}

	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentNo() {
		return StudentNo;
	}
	public void setStudentNo(String studentNo) {
		StudentNo = studentNo;
	}
	public String getStudentNSex() {
		return StudentNSex;
	}
	public void setStudentNSex(String studentNSex) {
		if(studentNSex!="女") {
			studentNSex="男";
		}
		StudentNSex = studentNSex;
	}
	public int getStudentAge() {
		return StudentAge;
	}
	public void setStudentAge(int studentAge) {
		if(studentAge<18 || studentAge > 100) {
			studentAge=18;
		}
		StudentAge = studentAge;
	}


	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", StudentNo=" + StudentNo + ", StudentNSex=" + StudentNSex
				+ ", StudentAge=" + StudentAge + "]";
	}
	
	
	
	
}
