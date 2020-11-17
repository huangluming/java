package com.imooc.test;

import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat();
		cat.setName("花花");
		cat.setSpecies("中华田园猫");
		cat.eat();
		cat.run();
		System.out.println("==========================");
		
		Dog dog = new Dog();
		dog.setName("妞妞");
		dog.setMonth(1);
		dog.eat();
		dog.sleep();
		
	}

}
