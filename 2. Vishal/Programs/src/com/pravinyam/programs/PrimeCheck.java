package com.pravinyam.programs;

public class PrimeCheck {
	public static void main(String[] args) {
		int n = 4; // Number to check

		boolean isPrime = true;

		if (n <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime)
			System.out.println(n + " is a Prime Number.");
		else
			System.out.println(n + " is Not a Prime Number.");
	}
	
	
}
