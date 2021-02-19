package com.qa.constru;

public class Animal {

	String animal_name;
	String animal_type;

	Animal(String name, String type) {

		this.animal_name = name;
		this.animal_type = type;

	}

	public void animalDetail() {
		System.out.println("Animal name is " + animal_name + "animal type is " + animal_type);
	}

	public static void main(String[] args) {

		Animal an = new Animal("Lion", "Omnivorus");
		an.animalDetail();

		Animal an1 = new Animal("Tiger", "Omnivores");
		an1.animalDetail();

	}

}
