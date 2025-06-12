package com.pravinyam.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UsingGeneric {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Sakshi");
		
		// list.add(10);     //  Compile-time error!
		// list.add(true);   //  Compile-time error!

		String name = list.get(0); //  No cast needed!
		System.out.println(name);
		
		List<String> list1 = new LinkedList<>();
		list1.add("Simba");
		list1.add("Sakshi");
		list1.add("Siya");
		
		for(String s : list1)
		{
			System.out.println(s);
		}
		
	}
}
