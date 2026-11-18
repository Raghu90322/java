package com.javaintro;

public class TestDemo1 {
	static TestDemo1 ra;
	
	static {
		System.out.println("Method1");
	}
	
	{
		System.out.println("main");
		ra = new TestDemo1();
	}

	public static void main(String[] args) {
		  


		System.out.println("method2");
		


	}

}
