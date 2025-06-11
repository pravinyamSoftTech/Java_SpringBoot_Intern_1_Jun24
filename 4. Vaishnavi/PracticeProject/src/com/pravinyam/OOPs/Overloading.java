package com.pravinyam.OOPs;

class Addition
{
	int add(int a,int b)
	{
		
		return a+b;
	}
	double add(double a,double b)
	{
		return a-b;
	}
}


public class Overloading {
 public static void main(String args[])
 {
	 Addition add=new Addition();
	 System.out.println("Addition of two numbers is\t"+add.add(4, 5)+ "\n&\t"+add.add(4, 5));
 }
}
