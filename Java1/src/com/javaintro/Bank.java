package com.javaintro;

public class Bank {
	
	 static String bankName;
	 String costmerName;
	 int accountNumber;
	 int balance;
	 
	void costmerName() {
		System.out.println("bankName =" + Bank.bankName);
		System.out.println("costmerName" + costmerName);
		System.out.println("accountNumber" + accountNumber);
		System.out.println("balance" + balance);
	}
	
	

	public static void main(String[] args) {
		System.out.println("First Costmer");
		bankName ="hdfc";
		Bank Raghu = new Bank();
		Raghu.costmerName = "raghu";
		Raghu.accountNumber = 1234567;
		Raghu.balance = 300000;
		Raghu.costmerName();

		Bank sai = new Bank();
		sai.costmerName = "Sai";
		sai.accountNumber = 12345;
		sai.balance = 20000;
		sai.costmerName();
		
		sai.costmerName();
	}

}
