package com.immutableclassdemo;

import java.util.Date;

// http://howtodoinjava.com/core-java/related-concepts/how-to-make-a-java-class-immutable/
public class CallimmutableClass {

	public static void main(String[] args) {
		ImmutableClassExample2 im2 = new ImmutableClassExample2(100, "StringObject", new Date());
		System.out.println(im2);

		tryModification(im2.getimmutableField1(), im2.getimmutableField2(), im2.getMutableDate());
		
		System.out.println(im2);
	}

	private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField) {
		immutableField1 = 10000;
		immutableField2 = "test changed";
		mutableField.setDate(10);
	}

}
