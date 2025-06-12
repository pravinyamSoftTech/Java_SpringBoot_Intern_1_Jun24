package conditional;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		
		Age a = new Age();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your age Is : ");
		int age = sc.nextInt();
		
		if(age >= 18)
		{
			System.out.println("You are Adult..");
		}
		else
		{
			System.out.println("You are not Adult..");
		}
		
	}
}
