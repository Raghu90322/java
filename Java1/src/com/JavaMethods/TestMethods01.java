package com.JavaMethods;

import java.util.Scanner;

public class TestMethods01 {
	Scanner sc = new Scanner(System.in);

	double add(double a, double b) {
		return a + b;
	}
	
	double subtract(double a1, double b1) {
		return a1- b1;
	}
	
	double multiply(double a2, double b2) {
		return a2* b2;
	}
	
	double division(double a3, double b3) {
		return a3 / b3;
	}
	void calculater() {
		
		System.out.println("enter first number:  ");
		double a1 = sc.nextDouble();
		System.out.println("enter second number:  ");
		double b1 = sc.nextDouble();
		
		double ad= add(a1, b1);
		System.out.println("Addition :"+ ad);
		
		System.out.println("enter first number:  ");
		double a2 = sc.nextDouble();
		System.out.println("enter second number:  ");
		double b2 = sc.nextDouble();
		double st = subtract(a2, b2);
		System.out.println("Subtraction :"+ st);
		
		System.out.println("enter first number:  ");
		double a3 = sc.nextDouble();
		System.out.println("enter second number:  ");
		double b3 = sc.nextDouble();
		double ml = multiply(a3, b3);
		System.out.println("Multipliaction :"+ ml);
		
		System.out.println("enter first number:  ");
		double a4 = sc.nextDouble();
		System.out.println("enter second number:  ");
		double b4 = sc.nextDouble();
		double di = division(a4, b4);
		System.out.println("Division :"+ di);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestMethods01 me = new TestMethods01();
		
		me.calculater();
		
		
		
		sc.close();

	}

}
