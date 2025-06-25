package com.pravinyam.inheritance;

public class Main {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.setAge(12);
		System.out.println(c1.getAge());
		c1.setName("Sakshi");
		System.out.println(c1.getName());
		c1.setAdd("Uttamnagar");
		System.out.println(c1.getAdd());
		c1.display();
	

	}

}
