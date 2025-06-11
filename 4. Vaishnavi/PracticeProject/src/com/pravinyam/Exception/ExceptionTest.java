package com.pravinyam.Exception;

public class ExceptionTest {

	public static void main(String args[]) {

		int a[] = new int[5];

		try {

			System.out.println(a[5]);
			System.exit(0);
		} catch (Exception e)

		{
			System.out.println("Exception occured" + e);
		}

		finally {
			System.out.println("This is a finaly block");

		}

	}

}
