package collection_frameword;
import java.util.HashMap; 
import java.util.Map;

public class Hashmap
{
    public static void main(String[] args) 
    {
        Map<Integer,Integer> h1 = new HashMap<>();

        h1.put(1, 10);
        h1.put(2, 20);
        h1.put(3, 30);
        h1.put(4, 40);
        h1.put(5, 50);

        System.out.println(h1);                                         
    }
}


