package com.pravinyam.abstractclass;

abstract class Animal {
	protected String name;
	
	Animal(String n){
		name = n;
		 System.out.println("Animal constructor called");
	}
	
	public void showname() {
		System.out.println("All animal make Diffrent Sound.." + name);
	}
	
	abstract void makesound();

}
