package com.problems.email_validator;

class PerimeterOfRectangle {
	public static void main(String[] args) {
		System.out.println(findPerimeter(6, 7));
	}
	static int findPerimeter(int length, int width) {
		return 2*(length+width);
	}
}
