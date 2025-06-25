package com.pravinyam.wrapperclass;

public class WrapperExample {

	public static void main(String[] args) {
		int a = 20 ;
		
		Integer num = Integer.valueOf(a);
		
		int b = num.intValue();
		
		System.out.println("Wrapper Class : " + num);
		System.out.println("Unwrapper Class : " + b);

	}

}
