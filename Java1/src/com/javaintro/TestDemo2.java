package com.javaintro;

public class TestDemo2 {
	
	static String collageName ="VELTECH";
	static String principleName ="Principle";
	int studentId;
	String studentName;
	String courseName;
	int marks;
	private Object newprinciple;
	
	static  void collage(){
		System.out.println("collageName: "+TestDemo2.collageName);
		System.out.println("principleName: "+TestDemo2.principleName);
		
	}
	
	void student(){
		System.out.println("studentId:"+ studentId);
		System.out.println("studentName:"+ studentName);
		System.out.println("courseName:"+ courseName);
		System.out.println("marks:"+ marks);
	}
	
	void  changePrincipal(String newPrinciple){
		principleName= newPrinciple;
	}
	
	public static void main(String[] args) {
		TestDemo2 student1 = new TestDemo2();
		student1.studentId =12345;
		student1.studentName="raghu";
		student1.courseName="ECE";
		student1.marks=98;
		student1.changePrincipal("dinesh");
     collage();
     student1.student();
	}

}
