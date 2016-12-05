
package com.foo;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "This is a Demo";
       // Index no  T=0,h=1,i=2,s=3, space=4,i=5,s=6,space=7, a=8, space =9, D=10
		String word2 = word.substring(10);
		System.out.println(word2);
		
		String word3 = word.substring(8);
		System.out.println(word3);
		
		
		// Two parameters : 1. beginning index (INCLUSIVE) & 2. End Index (EXCLUSIVE)
		String sub= "Hamburger";
		String sub1 = sub.substring(4, 8);
		System.out.println(sub1);
		
		String sub2 = "Smiles";
		String sub3 = sub2.substring(1, 5);
		System.out.println(sub3);

	}

}
