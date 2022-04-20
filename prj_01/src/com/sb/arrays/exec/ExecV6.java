package com.sb.arrays.exec;

public class ExecV6 {
	public static void main(String[] args) {
		int[] intArr = new int[100];
		int count = 0;
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int) (Math.random() * 100 + 1);
		}

		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] % 2 == 0) {
				System.out.print(intArr[i] + ",\t");
				count++;
				if (count % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}