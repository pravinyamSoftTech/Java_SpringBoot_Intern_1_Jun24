package com.pravinyam.Collection;

import java.util.*;
public class Arraylist {

	public static void main(String args[])
	{
	
	List<String> al=new ArrayList<String>();
	al.add("Vaishnavi");
	al.add("Pradnya");
	al.add("Shivani");
	al.add("Sakshi");
	al.add("Pooja");
	
	System.out.println("Array List is="+al);
	
	al.remove("Pooja");
	al.remove(1);
	System.out.println("Array List is after removing ="+al);
	
	System.out.println("Size of list is ="+al.size());
	
	}
}