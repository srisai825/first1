package Collectionsss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// Array list will maintain insertion order.
		// ArrayList will allow duplicate records
		// We can add element
		// We can get element
		// Using index u can fetch the value

		List<String> arrayList = new ArrayList<String>();

		// arrayList is empty so we areadding elements

		arrayList.add("Sai");
		arrayList.add("Benz");
		arrayList.add("Toyota");
		arrayList.add("Buggati");
		arrayList.add("CRV");

		System.out.println(arrayList);

		// ArrayLIst will maintain insertion order.For eg if you insert new eleemnt ot
		// will accept
		// Duplicates will allow.

		arrayList.add("Buggati");
		System.out.println(arrayList);

		// to retrive data using index

		System.out.println(arrayList.get(2));

		// to find some element in which index it is in the arraylist

		System.out.println(arrayList.indexOf("Toyota"));
		System.out.println(arrayList.lastIndexOf("Buggati"));

		// if you try to fetch an eleemnt which is not in the List then it will give you
		// -1
		System.out.println(arrayList.indexOf("Ambasador"));

		// adding one list to another list.copying one list to another

		List<String> newList = new ArrayList<String>();

		newList.addAll(arrayList);
		System.out.println(newList);

		newList.clear();
		System.out.println(newList);

		// to remove eleemn
		arrayList.remove(2);
		System.out.println(arrayList);
		arrayList.remove("CRV");
		System.out.println(arrayList);
		arrayList.add(null);
		System.out.println(arrayList);

		arrayList.set(0, "Maruti");
		System.out.println(arrayList);

		// to find the list whether it is empty or not

		System.out.println(arrayList.isEmpty());

		// Iterate the list
		for (String string : arrayList) {
			System.out.println("Using for each loop : " + string);

		}

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Using for loop : " + arrayList.get(i));

		}

		// forward traversing using list iterator

		ListIterator<String> iterator = arrayList.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		ListIterator<String> iterator1 = arrayList.listIterator();
		while (iterator1.hasPrevious()) {

			System.out.println(iterator1.next());
		}

		// Iteration with iterator(Note: Not List Iterator) Iterator can only traverse
		// forward but not on reverse.
		// Hence we are using List iterator for better usage
		Iterator<String> it = arrayList.iterator();
		while (it.hasNext()) {
			System.out.println("Forward only:" + it);
		}
	}
}
