package com.sb.arrays.exec;

public class ExecV2 {
	public static void main(String[] args) {
		int[] intArr = new int[100];

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int) (Math.random() * 100 + 1);
		}
		
		for (int i = 0; i < intArr.length; i++) {
			
			System.out.println(intArr[i]);
			
			if (intArr[i] % 2 == 0) {
				System.out.println("짝수입니다");
			} else {
				System.out.println("홀수입니다");
			}
		}
	}
}
