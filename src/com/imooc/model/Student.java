package com.imooc.model;

public class Student {
	private String StudentName;
	private String StudentNo;
	private String StudentNSex;
	private int StudentAge;
	private Major studentMajor;
	
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
//		this.setStudentMajor(studentMajor);
	}
	
	public Student(String studentName, String studentNo, String studentNSex, int studentAge,Major studentMajor) {
		super();
		this.setStudentAge(studentAge);
		this.setStudentName(studentName);
		this.setStudentNo(studentNo);
		this.setStudentNSex(studentNSex);
		this.setStudentMajor(studentMajor);
	}

	public Major getStudentMajor() {
		if(this.studentMajor==null) {
			 this.studentMajor = new Major();
		} 
		return studentMajor;
	}


	public void setStudentMajor(Major studentMajor) {

		this.studentMajor = studentMajor;
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
	
	public String intrduction() {
		String str="学生信息如下:\n姓名:"+this.getStudentName()+"\n学号："+this.getStudentNo()
				+"\n性别:"+this.getStudentNSex()+"\n年龄："+this.getStudentAge()
				+"\n专业："+this.getStudentMajor().getMajorName()
				+"\n专业编号："+this.getStudentMajor().getMajorCode()
				+"\n学制:"+this.getStudentMajor().getMajorYear();
		return str;
	}
	
	
	
}
