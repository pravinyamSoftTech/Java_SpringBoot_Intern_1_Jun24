package com.pravinyam.Exception;


class CheckAge
{
	void age(int age) throws Exception
	{
		if(age<18)
		{
		   throw new Exception("Age is less then 18");
		}
		System.out.println("Age is" +age );
	}
}
public class ThrowThrows {

	public static void main(String args[]) throws Exception
	{
		CheckAge age=new CheckAge();
		age.age(15);
	}
}
