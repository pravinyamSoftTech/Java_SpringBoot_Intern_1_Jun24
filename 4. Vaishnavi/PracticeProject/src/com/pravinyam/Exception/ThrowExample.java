package com.pravinyam.Exception;

class demo
{
	public void operation()
	{
		try
		{
			System.out.println("Inside.demo()");
			throw new NullPointerException("Exception ");
			
		}catch(NullPointerException e)
		{
			System.out.println("Pointer Exception");
		}
	}
}

public class ThrowExample
{
	public static void main(String args[])
	{
		demo de=new demo();
		de.operation();
	}
}