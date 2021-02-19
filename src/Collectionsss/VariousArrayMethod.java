package Collectionsss;

import java.util.ArrayList;
import java.util.Arrays;

public class VariousArrayMethod {

	public static void main(String[] args) {

		// Adding one array list to another array list

		ArrayList<String> program = new ArrayList<String>();
		program.add("Java");
		program.add("C++");
		program.add("Devops");
		program.add("Selenium");

		System.out.println(program);

		ArrayList<String> program2 = new ArrayList<String>(Arrays.asList("QA", "DEV", "BA"));
		System.out.println(program2);

		program.addAll(program2);
		System.out.println(program);

		program.remove(2);
		System.out.println(program);
		System.out.println(program2);

		System.out.println(program.removeAll(program2));
		System.out.println(program);

	}

}
