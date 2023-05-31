package com.problems.email_validator;

class MailValidator {
	public static void main(String[] args) {
		System.out.println(emailValidator("raj@a.com"));
	}
	
	static boolean emailValidator(String mail) {
		if((mail.contains("@") && mail.contains(".com"))) {
			String arr []= mail.split("@");
			if(arr.length <2 || arr[0].isBlank()) {
				return false;
			}else {
				String arr2 [] = arr[1].split(".com");
				if(arr2.length == 0) {
					return false;
				}else{
					return true;
				}
			}
		}else {
			return false;
		}
	}
}

