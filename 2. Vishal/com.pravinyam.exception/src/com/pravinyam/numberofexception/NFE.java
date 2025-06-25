package com.pravinyam.numberofexception;

public class NFE {
	public static void main(String[] args) {
	String str = "Vishal";
	
	try {
		int a = Integer.parseInt(str);
		System.out.println(a);
	}catch(NumberFormatException n) {
		System.out.println(n);
	}
	
	}

}
