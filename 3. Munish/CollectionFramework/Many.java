package CollectionFramework;
import java.util.*;
public class Many {
public static  void main(String agrs[]) {
	
	LinkedList<String> al = new LinkedList<String>();
	
	al.add("Pravinyam");
	al.add("softTech");
	al.add("private");
	al.add("Limited");
	
	Iterator itr = al.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
