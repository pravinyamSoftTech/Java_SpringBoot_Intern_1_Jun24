package com.pravinyam.OOPs;

class Animal{
	void sound()
	{
		System.out.println("Animal are cute");
	}
}
 interface Behaviour 
 {
	   default void  Behaviour()
	 {
		 System.out.println("Cat are rud");
	 }
 }
class Cat extends Animal implements Behaviour {
	void cat()
	{
		System.out.println("cat is meawing");
	}
}

public class Inheritance
{
	public static void main(String args[])
	{
		Cat cat=new Cat();
		cat.cat();
		cat.sound();
		cat.Behaviour();
	}
}