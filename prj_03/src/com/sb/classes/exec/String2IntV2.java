package com.sb.classes.exec;

public class String2IntV2 {
	public static void main(String[] args) {
		String strNum = "";
		int intNum = 0;
		if (strNum.equals("")) {
			System.out.println("숫자로 변환할 수 없음");
		} else if (strNum.equals("   ")) {
			System.out.println("space는 숫자로 변환할 수 없음");
		} else {
			intNum = Integer.parseInt(strNum);
		}

		System.out.println(intNum);
	}
}
