package Primenumber;

public class Prime {

	public static void main(String[] args) {

		int num = 7;
		int cnt = 0;

		if (num <= 1) {
			System.out.println("Not a Prime Number");
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					cnt++;
				}
			}
		}

		if (cnt == 0) {
			System.out.println("Number is prime ...");
		} else {
			System.out.println("Number is Not prime ...");
		}

	}

}