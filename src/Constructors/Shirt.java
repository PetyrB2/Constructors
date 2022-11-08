package Constructors;

public class Shirt {

	// Create a Shirt with a Constructor
	public static String name;
	public static String colour;
	public static String size;
	
	Shirt(String newName, String newColour, String newSize) {
		name = newName;
		colour = newColour;
		size = newSize;
	};
	
	// internal constructor
//	Shirt(){
//		System.out.println(name);
//		System.out.println(colour);
//		System.out.println(size);
//	}
	
	// Methods
	public static void rentedOut() {
		System.out.println("Rented Out");
	}
	public static void rentedIn() {
		System.out.println("Can be Rented");
	}
	
	public static void setColour(String newColour) {
		colour = newColour;
	}
	public static void setSize(String newSize) {
		size = newSize;
	}
	
}
