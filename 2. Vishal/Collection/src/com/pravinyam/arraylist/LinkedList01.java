package com.pravinyam.arraylist;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		
		LinkedList<Integer> li = new LinkedList<>();
		
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		
//		li.addFirst(01);
//		li.addLast(-1);
		
		System.out.println(li);
		
//		li.remove(1);     // Remove the Index..
//		System.out.println(li);
		
		
//		for(int i : li) {
//			System.out.println(i);
//		}
		
		System.out.println("Get First Element :- " + li.getFirst());
		System.out.println("Get Last Element :- " + li.getLast());
		
	}

}
