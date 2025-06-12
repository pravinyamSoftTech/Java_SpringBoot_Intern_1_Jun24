package CollectionFramework;
import java.util.*;
public class Main {
public static void main(String args[])
{
	ArrayList <String> list = new ArrayList<String>();
	
	list.add("munish");
	list.add("kapil");
	list.add("sanket");
	list.add("pankaj");
	
	Iterator itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
}
}
