package com.pravinyam.marksheet;

import java.util.Scanner;

public class MarkSheet {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Student Name : ");
//		String Name = sc.nextLine();
//		
//		System.out.println("Enter Student Roll No : ");
//		int Roll_No = sc.nextInt();
//		
//		String[] subject = {"Math" , "Science" , "English" , "Hindi" , "Marathi" , "Computer Science" } ;
//		
//		int[] mark = new int[subject.length];
//		int total = 0 ;
//		
//		for (int i = 0; i < subject.length; i++) {
//            System.out.print("Enter marks for " + subject[i] + ": ");
//            mark[i] = sc.nextInt();
//            total += mark[i];
//        }
//		
//		double average = (double) total / subject.length;
//		String result = "Pass";
//		String grade;
//		
//		for (int marks : mark) {
//            if (marks < 35) {
//                result = "Fail";
//                break;
//            }
//        }
//		
//		if (average >= 90) grade = "A+";
//        else if (average >= 80) grade = "A";
//        else if (average >= 70) grade = "B";
//        else if (average >= 60) grade = "C";
//        else if (average >= 50) grade = "D";
//        else grade = "F";
//		
//		
//		System.out.println("\n==============================");
//        System.out.println("         MARKSHEET            ");
//        System.out.println("==============================");
//        System.out.println("Name        : " + Name);
//        System.out.println("Roll Number : " + Roll_No);
//        System.out.println("------------------------------");
//        System.out.printf("%-15s %10s\n", "Subject", "Marks");
//        System.out.println("------------------------------");
//        
//        
//        
//        for (int i = 0; i < subject.length; i++) {
//            System.out.printf("\n", subject[i], mark[i]);
//        }
//        System.out.println("------------------------------");
//        System.out.printf("\n", "Total", total);
//        System.out.printf("\n", "Average", average);
//        System.out.printf("\n", "Result", result);
//        System.out.printf("\n", "Grade", grade);
//        System.out.println("==============================");
		
		
		
		        Scanner sc = new Scanner(System.in);

		        // Input student details
		        System.out.print("Enter student name: ");
		        String name = sc.nextLine();

		        System.out.print("Enter roll number: ");
		        int roll = sc.nextInt();

		        // Subjects
		        String[] subjects = {"Math", "Science", "English", "History", "Computer"};
		        int[] marks = new int[subjects.length];
		        int total = 0;

		        // Input marks
		        for (int i = 0; i < subjects.length; i++) {
		            System.out.print("Enter marks for " + subjects[i] + ": ");
		            marks[i] = sc.nextInt();
		            total += marks[i];
		        }

		        double average = (double) total / subjects.length;
		        String result = "Pass";
		        String grade;

		        // Check for pass/fail
		        for (int mark : marks) {
		            if (mark < 35) {
		                result = "Fail";
		                break;
		            }
		        }

		        // Calculate grade
		        if (average >= 90) grade = "A+";
		        else if (average >= 80) grade = "A";
		        else if (average >= 70) grade = "B";
		        else if (average >= 60) grade = "C";
		        else if (average >= 50) grade = "D";
		        else grade = "F";

		        // Print Marksheet
		        System.out.println("\n==============================");
		        System.out.println("         MARKSHEET            ");
		        System.out.println("==============================");
		        System.out.println("Name        : " + name);
		        System.out.println("Roll Number : " + roll);
		        System.out.println("------------------------------");
		        System.out.printf("%-15s %10s\n", "Subject", "Marks");
		        System.out.println("------------------------------");
		        for (int i = 0; i < subjects.length; i++) {
		            System.out.printf("%-15s %10d\n", subjects[i], marks[i]);
		        }
		        System.out.println("------------------------------");
		        System.out.printf("%-15s %10d\n", "Total", total);
		        System.out.printf("%-15s %10.2f\n", "Average", average);
		        System.out.printf("%-15s %10s\n", "Result", result);
		        System.out.printf("%-15s %10s\n", "Grade", grade);
		        System.out.println("==============================");

		        sc.close();
		    
		


				

	}

}
