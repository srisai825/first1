package com.qa.java;

public class BankAccount {

	// now i need data for bank account
	Long accountNumber = 1234567895l;
	String accountholname = "Sai";
	Integer accountBalance = 4500;

	// intha data mela act panna oru function venum
	// all the functions will act on data

	public void getBalance() {
		System.out.println("Balance is " + accountBalance);
	}

	public static void main(String[] args) {

		// create an object to get the data

		BankAccount ba = new BankAccount();
		ba.getBalance();
		// with this object ba u can call all the methods and the properties

		System.out.println(ba.accountholname);

	}

}
