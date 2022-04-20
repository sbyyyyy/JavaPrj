package com.sb.arrays.exec;

public class ExecV4 {
	public static void main(String[] args) {
		int[] intArr = new int[100];
		int evenSum = 0;

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int) (Math.random() * 100 + 1);
		}

		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] % 2 == 0) {
				evenSum += intArr[i];
				System.out.println("evenNum : " + intArr[i] + "\tevenSum : " + evenSum);
			}
		}

		System.out.println("┌"+"─".repeat(38)+"┐");
		System.out.println("\t짝수의 합은 " + evenSum + "입니다.");
		System.out.println("└"+"─".repeat(38)+"┘");
	}
}
