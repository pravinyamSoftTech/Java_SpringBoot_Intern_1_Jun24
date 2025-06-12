package com.pravinyam.Collection;

import java.util.*;
import java.util.List;

	public class IteratorExample {

		public static void main(String args[])
		{
		
		List<String> al=new ArrayList<String>();
		al.add("Pragati");
		al.add("Pradnya");
		al.add("Shivani");
		al.add("Sakshi");
		al.add("Pooja");
		
		System.out.println("Array List is=\n"+al);
		
		al.remove("Pooja");
		
		System.out.println("Array List is after removing =\n"+al);
		
		System.out.println("Size of list is =\n"+al.size());
		
		Iterator itr= al.iterator();
		 System.out.println("Element using iterator\n");
		 while(itr.hasNext())
		 {
			 String s=(String) itr.next();
			 
			 System.out.println(s);
		 }
		
		}
	}

