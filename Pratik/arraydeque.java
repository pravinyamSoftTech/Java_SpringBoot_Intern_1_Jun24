package collection_frameword;
import java.util.Deque;
import java.util.ArrayDeque;

public class arraydeque {

	public static void main(String[] args) 
	{
		Deque d1=new ArrayDeque();
		d1.offer(56);
		d1.offer(89);
		d1.offerFirst(23);
		d1.offerLast(9);
		System.out.println(d1);
	}

}
