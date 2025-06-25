package Primenumber;
import java.util.Scanner;
public class Prime01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int num = sc.nextInt();
		int count = 0 ;
		
		if(num <= 1) {
			System.out.println("The Number is Not Prime No : ");
		}else {
			for(int i = 2 ; i < num ; i++) {
				if(num % i == 0) {
					count ++ ;
				}
			}
		}
		if(count==0) {
			System.out.println("The Number is prime no.");
		}
		else {
			System.out.println("The no is not prime");
		}

	}

}
