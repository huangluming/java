package com.imooc.test;

import com.imooc.model.Major;
import com.imooc.model.Student;

public class MajorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Major m = new Major("计算机科学与技术","S0001",4);
		System.out.println(m.toString());
		System.out.println("==================================");
		
		Student s = new Student("张三","S001","男",19);
		System.out.println(s.toString());
	}

}
