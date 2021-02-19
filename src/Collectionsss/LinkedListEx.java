package Collectionsss;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {

		// adding elements

		LinkedList<Integer> numbers = new LinkedList<Integer>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);
		numbers.add(80);

		System.out.println(numbers);

		// Add an element to the first position

		numbers.addFirst(0);

		System.out.println("Linked list after adding first no " + numbers);

		// Add an element to the first position
		numbers.addLast(90);

		System.out.println("Linked list after adding last no " + numbers);

		// forloop

		for (Integer no : numbers) {
			System.out.println(no);

		}

		for (int i = 0; i < numbers.size(); i++)

			System.out.println("Numer list " + numbers.get(i));

	}

}
