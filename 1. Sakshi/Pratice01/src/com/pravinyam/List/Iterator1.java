package com.pravinyam.List;

import java.util.*;

public class Iterator1 {

	public static void main(String[] args) {
		
		List<String> arl = new ArrayList<>();
		arl.add("India");
		arl.add("America");
		arl.add("Japan");
		arl.add("Germani");
		arl.add("China");

		arl.remove(4);
		System.out.println("ArrayList : " + arl);
		
		Iterator itr = arl.iterator();
		
		System.out.println("Using Iterator : ");
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			System.out.println(s);
		}
		
	}
}
