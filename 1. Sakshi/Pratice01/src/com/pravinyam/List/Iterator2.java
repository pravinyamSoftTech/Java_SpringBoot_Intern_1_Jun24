package com.pravinyam.List;

import java.util.*;

public class Iterator2 {

public static void main(String[] args) {
		
		List<String> arl = new ArrayList<>();
		arl.add("India");
		arl.add("America");
		arl.add("Japan");
		arl.add("Germani");
		arl.add("China");

		arl.remove(4);
		System.out.println("ArrayList : " + arl);
		
		ListIterator<String> itr = arl.listIterator();
		
		System.out.println("\nUsing ListIterator (forward):");
		while(itr.hasNext())
		{
			String country = itr.next();
			System.out.println(country);
		}
		
		System.out.println("\nUsing ListIterator (backward):");
		while(itr.hasPrevious())
		{
			String country = itr.previous();
			System.out.println(country);
		}
	}
}
