package com.pravinyam.inheritance;

public class Parent {
	private int age = 20 ;
	private String Name = "Vishal";
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public void display() {
		System.out.println(age);
		System.out.println(Name);
	}

}
