package Collectionsss;

import java.util.HashSet;

public class Hashsett {

	public static void main(String[] args) {

		HashSet<String> name = new HashSet<String>();
		name.add("Sai");
		name.add("Priya");
		name.add("Kishore");
		name.add("Rose");
		name.add("Sam");
		name.add("Pam");

		// System.out.println(name);

		HashSet<String> names = new HashSet<String>();
		names.add("Sai");
		names.add("Samhi");
		names.add("Kishore");

		// get the union
		HashSet<String> union = new HashSet<String>(name);
		union.addAll(names);
		//
		System.out.println(union);

		// get the intersection
		HashSet<String> intersection = new HashSet<String>(name);
		intersection.retainAll(names);
		System.out.println(intersection);

		// get the difference
		HashSet<String> difference = new HashSet<String>(name);
		difference.removeAll(names);
		System.out.println(difference);
	}

}
