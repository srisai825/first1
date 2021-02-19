package Collectionsss;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterationNave {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();

		ar.add("carrot");
		ar.add("Beans");
		ar.add("Beetroot");
		ar.add("Tomato");
		ar.add("potato");

		System.out.println(ar);

		// Typical for loop
		for (String veges : ar) {

			System.out.println("Iterate all veges " + veges);

		}

		// For each loop
		for (int veg = 0; veg < ar.size(); veg++) {
			System.out.println("Iterate veges :" + ar.get(veg));
		}

		// after JDK 8 streams withlambda function for iteration

		ar.stream().forEach(ele -> System.out.println(ele));

		// Iterator
		System.out.println("---------------ITERATOR-----------");
		Iterator<String> it = ar.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
