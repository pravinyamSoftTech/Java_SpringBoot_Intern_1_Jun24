package pravinyam_task;
public class PrimeArray {

 
    public static boolean isPrime(int num) 
    { 
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17};

        System.out.println("Prime numbers in the given array:");

    
        for (int num : numbers) 
        {
            if (isPrime(num)) 
            
            {
                System.out.print(num + " ");
            }
        }
    }
}












