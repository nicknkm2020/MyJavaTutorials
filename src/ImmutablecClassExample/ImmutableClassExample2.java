package ImmutablecClassExample;

// http://howtodoinjava.com/core-java/related-concepts/how-to-make-a-java-class-immutable/

import java.util.Date;

//1. Final class
public final class ImmutableClassExample2 implements Cloneable{

	// 2. make instance variable final
	private final Integer immutableField1;
	private final String immutableField2;
	
	
	// Initialize all the fields via a constructor performing deep copy.
	public ImmutableClassExample2(Integer immutableField1, String immutableField2, Date date) {
		super();
		this.immutableField1 = immutableField1;
		this.immutableField2 = immutableField2;
		this.mutableDate = new Date(date.getTime()); // Always create new instance for mutable objects
		// this.mutableDate = date; // Don't do this
	}
	
	// 4. instance mutable variable
	// Special attention when having mutable instance variables
	// Always remember that your instance variables will be either mutable or immutable. 
	// Identify them and return new objects with copied content for all mutable objects. 
	// Immutable variables can be returned safely without extra effort.
	private final Date mutableDate;
		

	//3. No setter method for instance variable. Only getters.
	public Integer getimmutableField1() {
		return immutableField1;
	}

	public String getimmutableField2() {
		return immutableField2;
	}
		
	//Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
	public Date getMutableDate() {
		// return mutableDate; // Don't do this
		return new Date(mutableDate.getTime()); // Always create new instance for mutable objects
	}

	@Override
	public String toString() {
		return "ImmutableClassExample2 [immutableField1=" + immutableField1 + ", immutableField2=" + immutableField2
				+ ", mutableDate=" + mutableDate + "]";
	}	

}

