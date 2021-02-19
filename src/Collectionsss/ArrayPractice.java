package Collectionsss;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {

		ArrayList<String> s = new ArrayList<String>(Arrays.asList("Red", "Sai", "Sri", "Swami", "Manik", "Priya"));
		System.out.println(s);
		s.set(2, "Samhi");
		System.out.println(s);

	}

}
