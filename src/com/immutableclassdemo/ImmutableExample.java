package com.immutableclassdemo;

// 1. Create a class with final keyword
// so that no other class can extend this
// class, to change the state of class
final class Product{

	// 2. Create variables with final keyword
	// so that once values are assigned to it
	// they cannot be modified
	private final String name;
	private final int count;

	// 3. Create a public constructor which sets
	// the state of these variables
	public Product(String name, int count) {
		this.name = name;
		this.count = count;
	}

	// 4. Generate only the getters method and
	// no setters, so that no application calling class
	// can change the state of variables
	public String getName() {
		return name;
	}

	public int getCount() {
		return count;
	}
}

public class ImmutableExample {

	public static void main(String[] args) {

		// 5. Create a Product and assign values in
		// its constructor
		Product product = new Product("pen", 1);
		//Product product2 = (Product) product.clone();
		System.out.println(product.getName());
		System.out.println(product.getCount());

		// 7. No way for the application class
		// to change the state of Product class
		// as there are no setters or a way to
		// extend the final class , thus immutable
		// class is created
	}
}
