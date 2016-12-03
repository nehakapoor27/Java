package com.foo;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sampleString = "Honest is best policy, not";
		System.out.println("Before : " + sampleString);

		String sample = sampleString.replaceAll("not", "true");
		System.out.println("After :" + sample);

		String sample1 = sampleString.replaceAll("not", "").replaceAll(",", ".");
		System.out.println(sample1);
		// Remove all the character
		String sample2 = "afng100345fng1";
		String sample3 = sample2.replaceAll("[a-zA-Z]", "");
		System.out.println(sample3);
		// Remove all the numbers
		String sample4 = sample2.replaceAll("[^a-zA-Z]", "");
		System.out.println(sample4);
		
		//Remove special character
		String sample5 = "bask@&*1234df";
		String sample6 = sample5.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(sample6);

	}
}