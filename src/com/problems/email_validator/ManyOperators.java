package com.problems.email_validator;

class ManyOperators {
	public static void main(String[] args) {
		
	}
	public static int operate(int num1, int num2, String operator) {
		if(operator == "+") {
			return num1+num2;
		}else if(operator == "-") {
			return num1-num2;
		}else if(operator == "*") {
			return num1*num2;
		}else if(operator == "/") {
			return num1/num2;
		}else if(operator == "%") {
			return num1%num2;
		}
		return 0;
	}
}
