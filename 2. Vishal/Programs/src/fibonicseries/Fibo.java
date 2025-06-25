package fibonicseries;

public class Fibo {

	public static void main(String[] args) {
		getFibonnaciSeries(4);
		getFibonnaciSeries(8);
		getFibonnaciSeries(6);
		getFibonnaciSeries(5);
		getFibonnaciSeries(9);
		getFibonnaciSeries(3);
		checkEvenOdd(10);
	}

	private static void getFibonnaciSeries(int input) {
		int n1 = 0, n2 = 1, n3;
		System.out.println();
		System.out.print("Fibonnaci series for " + input + " : " + n1 + " " + n2 + " ");
		for (int i = 1; i <= input; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
	}

	private static boolean checkEvenOdd(int input) {
		boolean isEvenNumber = false;
		System.out.println();
		if (input % 2 == 0) {
			System.out.println("Number is even : " + input);
			isEvenNumber = true; 
		} else {
			System.out.println("Number is odd : " + input);
		}
		return isEvenNumber;
	}
}
