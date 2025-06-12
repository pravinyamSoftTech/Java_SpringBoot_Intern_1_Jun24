package com.pravinyam.arraylist;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector01 {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		v.add("AB");
		v.add("CD");
		v.add("EF");
		v.add("GH");
		v.add("IJ");
		
		for(String s : v) {
			System.out.println(s);
		}
		
		
		System.out.println("Using Iteration..");
		Iterator<String> it = v.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("Using Enumeration..");
		Enumeration<String> en = v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		
		System.out.println("Element at index 2: " + v.get(2));
        System.out.println("First Element: " + v.firstElement());
        System.out.println("Last Element: " + v.lastElement());
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());

	}

}
