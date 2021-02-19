package com.qa.conditional_statement;

public class Coffee {

	boolean cofmugempty = false;

	public static void main(String[] args) {
		// data type boolean true or false
		// default return type of a boolean false

		Coffee cof = new Coffee();

		if (cof.cofmugempty) {
			System.out.println("Fill the coffee");
		} else {
			System.out.println("Drink the coffee");
		}

	}

}
