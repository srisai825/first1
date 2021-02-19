package com.qa.conditional_statement;

public class Switchred {

	String color = "red";
	String flower = "Jasmine";

	public void selectColor() {

		switch (color) {
		case "blue":
			System.out.println("The color is blue");
		case "white":
			System.out.println("Jasmine is white");

		case "black":
			System.out.println("Eye ball is black");
		default:
			System.out.println("Select the correct color");
			break;
		}
	}

	public void correctFlower() {
		switch (flower) {
		case "redrose":
			System.out.println("The flower is Jasmine");
			break;
		case "Jasmine":
			System.out.println("Jasmine is white");
			break;

		case "Mantharai":
			System.out.println("Mantharai");
			break;
		default:
			System.out.println("Select the correct flower");
			break;
		}
	}

	public static void main(String[] args) {

		Switchred rose = new Switchred();
		rose.selectColor();

		Switchred fl = new Switchred();
		fl.correctFlower();

	}

//if we dont give break statement then when condition satisfies it will not only excute that particular statemnt
//	it willexecute al statemnet.in order to avoid need to give break statement.

}
