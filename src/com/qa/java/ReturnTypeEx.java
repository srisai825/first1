package com.qa.java;

public class ReturnTypeEx {

	public static Integer amount = 1000;

	public Integer collectAmount() {
		System.out.println("amount collected");
		return amount;
	}

	public static void main(String[] args) {

		ReturnTypeEx rt = new ReturnTypeEx();
		Integer amt = rt.collectAmount();
		System.out.println("collection done " + amt);

	}

	// here we asked to do a function and it did.collected the amount. but it didnt
	// inform wethere it has.it needs
	// to return.
}
