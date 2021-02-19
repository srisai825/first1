package Collectionsss;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListNaveen {

	public static void main(String[] args) {

		// VirtualCapacity.how do you change the virtual capacity

		ArrayList<Object> ar = new ArrayList<Object>(20);

		// ArrayList<Object> ar = new ArrayList<Object>(20); 20 is virtual capacity no
		ar.add(10);
		System.out.println(ar.size());

		ar.add(20);
		ar.add(35);
		ar.add(56);
		System.out.println(ar.size());

		// List with other collection

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30));
		System.out.println(numbers);

		for (Integer nolist : numbers) {
			System.out.println(nolist);

		}

		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Hi", "Bye", "Sai"));
		System.out.println(names);
	}

}
