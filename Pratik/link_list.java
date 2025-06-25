package collection_frameword;
import java.util.List;
import java.util.LinkedList;
         
public class link_list
{         
        
	public static void main(String[] args) 
	{     
		List<Integer> l1= new LinkedList<>();
		l1.add(25);    
		l1.add(15);
		l1.add(100);
		l1.remove(1);
		System.out.println(l1);
		
		
        
	}   
        
}  



/*
 public class GenericMethodExample {

    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World", "Generic", "Method"};

        System.out.print("Integer Array: ");
        printArray(intArray); // Works with Integer type

        System.out.print("String Array: ");
        printArray(stringArray); // Works with String type
    }
}
Type Parameter: <T> is the type parameter. It is placed before the return type
 void of the method printArray.

Method Signature: public static <T> void printArray(T[] array) defines a 
generic method where T can be any type.

Usage: Inside the main method, printArray is called with an Integer array and
 a String array, demonstrating that the same method can handle different types.
*/

        