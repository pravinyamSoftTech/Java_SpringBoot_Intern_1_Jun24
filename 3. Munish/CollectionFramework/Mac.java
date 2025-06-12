package CollectionFramework;
import java.util.*;
public class Mac {
public static void main(String args[]) {
	Vector<Integer> v = new Vector<Integer>();
	
	v.add(100);
	v.add(200);
	v.add(300);
	v.add(400);
	
	Iterator itr = v.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
