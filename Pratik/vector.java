package collection_frameword;
import java.util.Vector;
//Vector is a dynamic array that can grow or shrink in size as needed to 
//accommodate adding and removing elements
//Vector is synchronized, meaning it is thread-safe and can be used in a 
//concurrent environment without explicit synchronization.


public class vector {

	public static void main(String[] args) 
	{
	Vector<Integer> v1= new Vector<Integer>();
	v1.add(76);
	v1.add(39);
	v1.add(99);
	v1.add(51);
	v1.remove(2);
	System.out.println(v1);

	}

}
