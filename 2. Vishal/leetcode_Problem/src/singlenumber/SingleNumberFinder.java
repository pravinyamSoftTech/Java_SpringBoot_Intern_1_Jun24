package singlenumber;

public class SingleNumberFinder {
	
	 public static int singleNumber(int[] nums) {
	        int result = 0;

	       
	        for (int num : nums) {
	            result ^= num;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] nums = {2, 2, 3 , 5 , 3};

	        int unique = singleNumber(nums);
	        System.out.println("The single number is: " + unique);
	    }

}
