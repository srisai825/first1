package Stringggg;

public class StrBuffer {

	// StringBuffer Methods

	public static void main(String[] args) {

		// Reverse,Delete,Capacity,Replace

		StringBuffer name = new StringBuffer("Shivani");
		System.out.println(name.append("Ram"));
		// you cannot reverse a string because it is immutable.
		// In string buffer you can reverse a sting

		// Reverse

		System.out.println("Reversed name  : " + name.reverse());
		StringBuffer nam1 = new StringBuffer("DeviSri");
		System.out.println(nam1.reverse());

		// Delete

		StringBuffer delete = new StringBuffer("Carrot");
		System.out.println(delete.delete(2, 4));

		// insert
		StringBuffer insert = new StringBuffer("Benz");
		System.out.println(insert.insert(4, "Car"));

		// capacity
		System.out.println(insert.capacity());
	}

}
