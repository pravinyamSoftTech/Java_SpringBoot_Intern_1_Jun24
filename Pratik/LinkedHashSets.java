package collection_frameword;
import java.util.Set;
import java.util.LinkedHashSet;
public class LinkedHashSets 
{

	public static void main(String[] args)
	{
		LinkedHashSet s1=new LinkedHashSet();
		s1.add(78);
		s1.add(12);
		s1.add(36);
		s1.add(15);
		s1.add(90);
		s1.remove(36);
		System.out.println(s1);

	}

}
