package com.javaintro;

public class tes {

	static void display() {
		int x = 0;
		int y = -1;
		int z = (x + y) - --x + (x + 1) - y-- + x--;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("-------------------");
	}

	static void display1() {
		int x = 5;
		int y = 4;
		int z = x * x + (--y) * (--y) - (x++) * (x++) - y++ + x-- + y--;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("==========================");
	}

	static void display2() {
		int x = -2;
		int y = -5;
		int z = (x++ * 2) - (y - 2) + ((x--) - 4) + (y++ * 4);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}

	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		int z = x++ - --y - x + y - x-- + y--;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("______________");
		display();
		display1();
		display2();

	}
}