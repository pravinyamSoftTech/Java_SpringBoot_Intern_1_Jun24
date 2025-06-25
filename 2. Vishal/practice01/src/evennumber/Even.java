package evennumber ;

public class Even {
	public static void main(String[] args)
	{
         int[] numbers = {12,2,4,6,7,9,10};
         for(int num : numbers) {
        	 if(num % 2 == 0 )
        	 {
        		 System.out.println(num);
        	 }
         }
         }
}