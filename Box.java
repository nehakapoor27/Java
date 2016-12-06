package com.foo;

public class Box {

	int x;
	int y;

	public Box(int theX, int theY) {
		x = theX;
		y = theY;
	}

	public int getArea() {
		return x * y;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b1 = new Box(10, 15);
		System.out.println(b1.getArea());
	

	}

}
