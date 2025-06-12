package com.pravinyam.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		
//		al.remove("D");
//		al.remove(2);
		
//		System.out.println(al);
		
		
//		for(String str : al){
//			System.out.println(str);
//		}
		
//		for (int i = 0; i < al.size(); i++) {
//		    System.out.println(al.get(i));
//		}
		
//		Iterator it = al.iterator();
//		
//		while(it.hasNext()) {
//			String s = (String)it.next();
//			System.out.println(s);
//		}
		
		
		ListIterator<String> it = al.listIterator();
		while(it.hasNext()) {
			System.out.println(it.hasNext());
		}
		
	
		
//        ListIterator<String> it = al.listIterator();
//
//        
//        while (it.hasNext()) {
//            it.next();
//        }
//
//        
//        System.out.println("Backward Traversal:");
//        while (it.hasPrevious()) {
//            System.out.println(it.previous());
//        }
	}

}
