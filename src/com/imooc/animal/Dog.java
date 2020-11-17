package com.imooc.animal;

public class Dog extends Animal {
	private String sex;
	
	public Dog() {
		
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void sleep() {
		System.out.println(this.getName()+"有"+this.getMonth()+"个月大了，它在睡觉！");
	}
}
