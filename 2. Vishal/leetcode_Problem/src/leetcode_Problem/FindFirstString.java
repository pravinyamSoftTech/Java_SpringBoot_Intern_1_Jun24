package leetcode_Problem;


public class FindFirstString {
	
	public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = strStr(haystack, needle);
        
//        int secondIndex = -1;
//        if (result != -1) {
//            secondIndex = haystack.indexOf(needle, result + 1);
//        }
        System.out.println("Result: " + result);
//        System.out.println("Second : " + secondIndex);
    }

    
}
