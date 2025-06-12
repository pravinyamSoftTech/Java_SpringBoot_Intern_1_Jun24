package polymorphisamoverloading;

public class Main {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println("Sum Of Two No : " + c1.add(12, 12));
		
		System.out.println("double Add : " + c1.add(12, 13.5));
		
		System.out.println("Sum Of Three No : " + c1.add(12, 12, 12));

	}

}
