package com.problems.email_validator;

class True_count {
	public static void main(String[] args) {
		boolean arr [] = {true,false,true,false,false};
		System.out.println(countTrue(arr));
	}
	public static int countTrue(boolean[] arr) {
		if(arr.length > 0) {
			int xyz =0;
			for(int i =0; i<arr.length;i++) {
				if(arr[i]) {
					xyz=xyz+1;
				}
			}
			return xyz;
		}
		return 0;
	}
}
