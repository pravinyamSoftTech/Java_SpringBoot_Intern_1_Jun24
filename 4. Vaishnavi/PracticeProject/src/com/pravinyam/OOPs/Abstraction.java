package com.pravinyam.OOPs;

abstract class Shapes
{
	abstract void circle();
	
}
class Circle1 extends Shapes
{

	@Override
	void circle() {
		System.out.println("This is a abstract class");
		
	}
	
}
public class Abstraction
{
	public static void main(String args[])
	{
		Circle1 c1=new Circle1();
		c1.circle();
	}
}