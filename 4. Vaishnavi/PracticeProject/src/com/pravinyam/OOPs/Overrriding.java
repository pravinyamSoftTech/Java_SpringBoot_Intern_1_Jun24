package com.pravinyam.OOPs;

class Car
{
	void types()
	{
		System.out.println("Car are of many types");
	}
}

class Kiya extends Car{
	@Override
	void types()
	{
		System.out.println("car is my Beautiful");
	}
}
public class Overrriding {
	public static void main(String args[])
	{
		Car car=new Kiya();
		
		car.types();
	}

}
