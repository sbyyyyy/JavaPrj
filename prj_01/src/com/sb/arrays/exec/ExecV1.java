package com.sb.arrays.exec;

public class ExecV1 {
	public static void main(String[] args) {
		int rndNum = (int) (Math.random() * 100 + 1);
		
		System.out.println("rndNum = " + rndNum);
		
		if (rndNum % 2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
	}
}
