package com.pravinyam.List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Apple");
		al.add("Banana");
		al.add("Mango");
		al.add("Guava");
		al.add(2,"Grapes");
//		System.out.println("Fruits : " + al);
//		
//		al.set(0, "Opel");
//		System.out.println(al.get(0));
//		
//		System.out.println(al.size());
		
//		  System.out.println("Before clear(): " + al);
//
//	      al.clear();
//
//	      System.out.println("After clear(): " + al); 
		
		for (String i : al) {
		      System.out.println(i);
		    }
		
	}

}
