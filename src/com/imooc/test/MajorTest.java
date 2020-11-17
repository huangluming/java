package com.imooc.test;

import com.imooc.model.Major;
import com.imooc.model.Student;

public class MajorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Major m = new Major("计算机科学与技术","S0001",4);
		System.out.println(m.toString());
		System.out.println("==================================");
		
		Student s = new Student("张三","S001","男",19,m);
		Student s2 = new Student("李四","S001","女",18);
		Student s3 = new Student("王五","S001","男",20);
//		System.out.println(s.toString());
		System.out.println(s.intrduction());
		System.out.println("==================================");
		
		m.addStudent(s);
		m.addStudent(s2);
		m.addStudent(s3);
		System.out.println(m.getStudentNum());
		
	}
	

}
