package com.javaintro;

public class Employe {
	static String companyName = "TCS";
	int empId;
	String employeName;
	String departmentName;
	int salary;

	public static void main(String[] args) {
		System.out.println("First Employe");
	Employe Gnani = new	Employe();
		Gnani.empId = 101;
		Gnani.employeName = "Gnanendra";
		Gnani.departmentName="Develops";
		Gnani.salary=30000;
	System.out.println("companyName: "+Employe.companyName );
	System.out.println("empId: "+Gnani.empId );
	System.out.println("employeName: "+Gnani.employeName );
	System.out.println("departmentName: "+Gnani.departmentName );
	System.out.println("salary: "+Gnani.salary );

	companyName = "Wipro";
	System.out.println("second Emplye");
	Employe Sai = new	Employe();
		Sai.empId = 102;
		Sai.employeName = "Sai";
		Sai.departmentName="Developer";
		Sai.salary=500000;
	System.out.println("companyName: "+Employe.companyName );
	System.out.println("empId: "+Sai.empId );
	System.out.println("employeName: "+Sai.employeName );
	System.out.println("departmentName: "+Sai.departmentName );
	System.out.println("salary: "+Sai.salary );
	
	System.out.println("second Emplye");
	Employe Harsha = new	Employe();
	Harsha.empId = 103;
	Harsha.employeName = "Harsha";
	Harsha.departmentName="software eng";
	Harsha.salary=900000;
	System.out.println("companyName: "+Employe.companyName );
	System.out.println("empId: "+Harsha.empId );
	System.out.println("employeName: "+Harsha.employeName );
	System.out.println("departmentName: "+Harsha.departmentName );
	System.out.println("salary: "+Harsha.salary );

	

	}

}
