package Constructors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	
//		Shirt armani = new Shirt();
//		armani.setColour("White");
//		
//		armani.setSize("Medium");
//		
//		armani.rentedIn();
//		
	
	System.out.println("");
	
		Shirt s = new Shirt("Armani Shirt", "Black", "Small");
		System.out.println(s.name);
		System.out.println(s.colour);
		System.out.println(s.size);
	
	}

}
