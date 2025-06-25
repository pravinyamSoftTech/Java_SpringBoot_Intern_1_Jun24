package com.pravinyam.exception01;

class ThrowDemo {
	void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not valid Age for voting");
		} else {
			System.out.println("You are eligible for voting");
		}
	}

	public static void main(String args[]) {
		ThrowDemo d1 = new ThrowDemo();
		d1.validate(16);
	}
}