package com.vishal.programs;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch ;
		do
		{
		System.out.println(" 1 : getFibonnaciSeries \n" + " 2 : checkEvenOdd \n" + " 3 : checkPrime \n" + " 4 : checkSqure\n" + " Enter Your Choice : ");
		ch = sc.nextInt();
		
		System.out.println("Enter Any Number : ");
		int a = sc.nextInt();
		
		switch(ch)
		{
		case 1 :
			getFibonnaciSeries(a);
			break;
			
		case 2 : 
			checkEvenOdd(a);
			break;
			
		case 3 : 
			checkPrime(a);
			break;
			
		case 4 :
			checkSqure(a);
			break;
	
		default :
			System.out.println("Invalid Choice.");
			break ;
		}
		}
		
		while(ch != 5);
		
	}
	private static void getFibonnaciSeries(int input)
	{
		int n1 = 0 , n2 = 1 , n3 ;
//		System.out.println();
		System.out.println("Fibonnaci series for " + input + " : " + n1 + " " + n2 + " " );
		for(int i = 1 ; i <= input ; i++)
		{
			n3 = n1 + n2;
			System.out.println(n3 + " ");
			n1 = n2 ;
			n2 = n3 ;
		}
	}
	
	public static boolean checkEvenOdd(int input)
	{
		boolean isEvenNumber = true;
		if(input % 2 == 0)
		{
			System.out.println("Number Is Even : " + input);
			isEvenNumber = false;
		}else {
			System.out.println("Number Is Odd : " + input);
		}
		return isEvenNumber;
	}
	
	public static void checkPrime(int input)
	{
		
		boolean isPrime = true;
		
		if(input <= 1)
		{
			isPrime = false;
		}else {
			for(int i = 2 ; i <= Math.sqrt(input) ; i++ )
			{
				if (input % i == 0)
				{
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime)
			System.out.println(input + "Is a Prime Number.");
		else
			System.out.println(input + "Is Not Prime Number.");
	}
	public static void checkSqure(int input)
	{
		int m;
		m = input * input ;
		System.out.println(m);
	       
	}
}
