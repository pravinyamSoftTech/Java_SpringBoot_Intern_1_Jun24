package scanner01;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Choice :"+"\n1.Addition" + "\n2.Substraction" +"\n3.Multiplication" +
		                    "\n4.Division");
		
		int ch = sc.nextInt();
		
		System.out.println("Enter First Value : " );
		int x= sc.nextInt();		
		
		System.out.println("Enter Second Value : " );
		int y= sc.nextInt();
		
		switch(ch)
		{
			case 1:
				System.out.println("The Addition Is "+ c1.Addition(x, y));
				break;
				
			case 2:
				System.out.println("The Substraction Is "+ c1.Subtraction(x, y));
				break;
				
			case 3:
				System.out.println("The Multiplication Is "+ c1.Multiplication(x, y));
				break;
				
			case 4:
				System.out.println("The Division Is "+ c1.Division(x, y));
				break;
		}
	}

}
