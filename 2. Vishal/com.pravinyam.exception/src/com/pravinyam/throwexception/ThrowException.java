package com.pravinyam.throwexception;


//public class ThrowException {
//	public static void main(String[] args) {
//		int age = 16 ;
//		try {
//			if(age < 18) {
//				throw new ArithmeticException("You are not elgible to vote..");
//			}else {
//				System.out.println("Eligble to vote.");
//			}
//		}catch(ArithmeticException e) {
//			System.out.println("Exception caught " + e.getMessage());
//		}
//		
//	}
//
//}


class ThrowException{
	static void demo() {
		try {
			System.out.println("Inside Demo..");
			throw new NullPointerException("Exception data..");
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne);
		}
	}
}
class ThrowMain {
	public static void main(String[] args) {
		ThrowException.demo();
	}
}
