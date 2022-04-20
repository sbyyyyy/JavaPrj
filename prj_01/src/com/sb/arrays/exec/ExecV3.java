package com.sb.arrays.exec;

public class ExecV3 {
	public static void main(String[] args) {
		int[] intArr = new int[100];
		int evenNum = 0;

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int) (Math.random() * 100 + 1);
		}

		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] % 2 == 0) {
				evenNum++;
				System.out.println("even : " + intArr[i] + "\tsum : " + evenNum);
			}
		}
		
		System.out.println("─".repeat(30));
		System.out.println("짝수는 총 " + evenNum + "개 입니다.");
		System.out.println("─".repeat(30));
	}
}
