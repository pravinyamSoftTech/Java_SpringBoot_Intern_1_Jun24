package com.pravinyam.abstractclass;

public class Dog extends Animal{
	Dog(String name){
		super(name);
		System.out.println("Dog Constructor Is Called.." + name);
	}

	void makesound() {
		System.out.println("Dog is barking..");
	}

}
