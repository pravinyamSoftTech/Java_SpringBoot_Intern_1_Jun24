package com.pravinyam.List;

import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<String> cities = new LinkedList<>();
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Bangalore");
		cities.add("Chennai");
		
	    System.out.println("Cities: " + cities);
	    
	    cities.addFirst("Kolkata");
        cities.addLast("Hyderabad");

        System.out.println("After addFirst & addLast: " + cities);
        
        cities.remove("Mumbai");
        cities.removeFirst(); 
        cities.removeLast();  

        System.out.println("After removal: " + cities);

        System.out.println("First city: " + cities.getFirst());
        System.out.println("Last city: " + cities.getLast());
	}

}
