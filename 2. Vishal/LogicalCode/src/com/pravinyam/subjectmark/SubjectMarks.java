package com.pravinyam.subjectmark;

import java.util.Scanner;

public class SubjectMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] subject = {"English" , "Marathi" , "Physics" , "Science" } ;
		int total = 0 ;
		
		for(int i = 0 ; i < subject.length ; i++) {
			System.out.println("Enter Mark For : " + subject[i]);
			int mark =sc.nextInt();
			total += mark ;
		}
		double avrage = (double) total / subject.length ;
		
		System.out.println("Total Mark : " + total);
		System.out.println("percentage Of Mark : " + avrage);

	}

}
