package com.pravinyam.exception01;

public class CheckException {


	public static void main(String[] args) {
//		try {
//			int a = 10;
//			int b = 0 ;
//			int ans = a / b ;
//			System.out.println(ans);
//		}catch(ArithmeticException e) {
//			System.out.println(e);
//		}
		
		
		
		try {
			int a = 10 ;
			int b = 0 ;
			if(b==0) {
				throw new ArithmeticException("division by zero is not Allowed..");
			}
			int ans = a / b;
			System.out.println(ans);
		} catch(ArithmeticException e) {
			System.out.println(e);
		}
		
	}

}
