package com.javaintro;

import java.util.Scanner;

public class TestDemoStudent {
	
	Scanner sc = new Scanner(System.in);
	
	
	void marks() {
		System.out.println("marks:");
    
	}
	int  submarks() {
		System.out.println("Enter math Marks:");
		int ma = sc.nextInt();
		System.out.println("Enter phy Marks:");
		int ph = sc.nextInt();
		System.out.println("Enter chy Marks:");
		int ch = sc.nextInt();
		int totalMarks = ma+ph+ch;
		System.out.println( "Total Marks: " + totalMarks);
		return totalMarks;
	}
	void average( int a) {
		int tlmarks = a /3;
		System.out.println("average marks:  "+ tlmarks);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestDemoStudent st = new TestDemoStudent();
		st.marks();
		System.out.println(" Enter Marks: " ); 
		int sa = sc.nextInt();
		int a = st.submarks();
		st.average(a);
		
		sc.close();

	}

}
