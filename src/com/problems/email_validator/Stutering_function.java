package com.problems.email_validator;

class Stutering_function {
	public static void main(String[] args) {
		System.out.println(stutter("hello"));
	}
    static String stutter(String word) {
		char arr [] = word.toCharArray();
		return ""+arr[0]+arr[1]+"... "+arr[0]+arr[1]+"... "+word+"?";
	}
}	
