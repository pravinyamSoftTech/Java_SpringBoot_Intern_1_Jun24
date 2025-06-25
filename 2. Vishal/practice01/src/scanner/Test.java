package scanner;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		calculator c= new calculator();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Choice \n:"+"1:Addition\n"+"2:Subtraction\n"+"3:Multiplication\n"+"4: Division\n"+"5:Modules ");
		
		int ch = s.nextInt();
				
		System.out.println("Enter The First Value : ");
		int a = s.nextInt();
		
		System.out.println("Enter The First Value : ");
		int b = s.nextInt();
		
		switch(ch)
		{
		case 1 :
			System.out.println("The Addition Is : "+c.Add(a, b));
			break;
			
		case 2 :
			System.out.println("The Subtraction Is : "+c.Sub(a, b));
			break;
			
		case 3 :
			System.out.println("The Multiplication Is : "+c.Mul(a, b));
			break;
			
		case 4 :
			System.out.println("The Division Is : "+c.Div(a, b));
			break;
			
		case 5 :
			System.out.println("The Modules Is : "+c.Mod(a, b));
			break;
		}
		
		

	}

}
