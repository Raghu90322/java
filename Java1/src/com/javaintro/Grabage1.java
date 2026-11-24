package com.javaintro;

public class Grabage1 {

	int marks;
	String name;

	@Override
	protected void finalize() {
		System.out.println("Finalize gc");
	}

	void gra() {
		System.out.println("Scope Of Project");
	}

	public static void main(String[] args) {
		Grabage1 g1 = new Grabage1();
		System.out.println(g1);

		Grabage1 g2 = new Grabage1();
		System.out.println(g2);

		Grabage1 g3 = new Grabage1();
		System.out.println(g3);

		Grabage1 g4 = new Grabage1();
		System.out.println(g4);

		g1 = null;

		g3 = g2;

		g4.gra();

		new Grabage1();

		System.gc();

	}

}
