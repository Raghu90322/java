package com.javaintro;

public class TestDemo {

	public static void main(String[] args) throws ClassNotFoundException  {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Class.forName("com.javaintro.TestDemo");
				Class.forName("java.lang.String");
				Class.forName("java.lang.class");
			
			System.out.println("loaded");
		
	}

}
