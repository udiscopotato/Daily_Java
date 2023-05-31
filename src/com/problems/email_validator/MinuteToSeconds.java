package com.problems.email_validator;

class MinuteToSeconds {
	public static void main(String[] args) {
		System.out.println(convert(6));
	}
	static int convert(int minutes) {
		return  minutes*60;
	}
}
