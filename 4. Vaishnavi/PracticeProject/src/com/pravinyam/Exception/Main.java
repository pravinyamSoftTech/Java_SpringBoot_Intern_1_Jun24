package com.pravinyam.Exception;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAgeUsingTry(15);

	}

	static void checkAge(int age) throws ArithmeticException {
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
	}

	static void checkAgeUsingTry(int age) {

		try {
			if (age < 18) {
				throw new ArithmeticException("Access denied - You must be at least 18 years old.");
			} else {
				System.out.println("Access granted - You are old enough!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print("Exceotion" + e);
		}

	}

}
