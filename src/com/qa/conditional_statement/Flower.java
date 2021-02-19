package com.qa.conditional_statement;

public class Flower {

	String flower = "Lotus";

	public void favFlower() {
		if (flower.equals("Rose")) {
			System.out.println("You have selected a correct flower");
		}

		else if (flower.equals("Lilly")) {
			System.out.println("You have selected a correct flower");
		} else if (flower.equals("Lotus")) {
			System.out.println("Correct flower");
		} else {
			System.out.println("Kindly pick correct flower");
		}
	}

	public static void main(String[] args) {

		Flower fl = new Flower();
		fl.favFlower();

	}

}
