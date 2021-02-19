package Collectionsss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayyCloning {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Orange");
		names.add("apple");
		names.add("grapes");
		names.add("Strawberry");

		System.out.println(names);

		ArrayList<String> arList = (ArrayList<String>) names.clone();
		System.out.println(arList);

		boolean b = arList.contains("Orange");
		System.out.println(b);

		System.out.println(arList.indexOf("grapes") > 0);

		ArrayList<String> Flower = new ArrayList<String>();
		Flower.add("Lotus");
		Flower.add("Jasmine");
		Flower.add("Jasmine");
		Flower.add("Lotus");
		Flower.add("Rose");

		System.out.println(Flower.lastIndexOf("Jasmine"));
		System.out.println(Flower.remove(2));
		System.out.println(Flower);

		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
		num.removeIf(no -> no % 2 == 0);
		System.out.println(num);

		// RetainAll

		ArrayList<String> colors = new ArrayList<String>(
				Arrays.asList("Red", "Blue", "Red", "Orange", "Green", "Purple", "Violet", "Gold"));
		colors.retainAll(Collections.singleton("Red"));
		System.out.println(colors);

		// SubList

		ArrayList<Integer> noList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
		ArrayList<Integer> subList = new ArrayList<Integer>(noList.subList(3, 7));
		System.out.println(subList);

		ArrayList<String> veg = new ArrayList<String>(Arrays.asList("carrot", "beans", "potato", "Beetroot", "Tomato"));
		Object ar[] = veg.toArray();
		System.out.println(Arrays.deepToString(ar));

		for (Object object : ar) {
			System.out.println(object);

		}
	}

}
