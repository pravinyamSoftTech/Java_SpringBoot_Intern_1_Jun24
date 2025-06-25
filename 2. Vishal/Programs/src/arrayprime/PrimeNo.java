package arrayprime;
import java.util.*;
public class PrimeNo {
	public static void main(String[] args)
	{
		int count=0;
		int n=10;
		
		for(int i = 2; i< n ; i ++) {
			
			if( n % i  == 0)
			{
				count++ ;
			}
		}
			if(count == 0) {
				System.out.println("Prime Number..");
			}
			else
			{
				System.out.println("Not Prime Number..");
			}	
	}
}
