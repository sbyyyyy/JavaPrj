package com.sb.classes.exec;

import java.util.Arrays;

public class StringEx1 {

	public static void main(String[] args) {
		String strNation = "대한민국만세";
		System.out.println(strNation);

		String strName = new String("홍길동");
		System.out.println(strName);

		String strNo1 = strNation.substring(3);
		System.out.println(strNo1);

		String strNo2 = strNation.substring(3, 5);
		System.out.println(strNo2);

		for (int i = 0; i < strNation.length(); i++) {
			System.out.println(strNation.substring(i));
		}
		
		for (int i = 0; i < strNation.length(); i++) {
			System.out.println(strNation.substring(i, i + 1));
			//문자열 마지막에 공백문자(\0 / NULL)가 삽입되어 있다.
		}

		String[] splitStr = strNation.split("");
		System.out.println(Arrays.toString(splitStr));

		String conStr = strNation.concat(" " + strName);
		System.out.println(conStr);
		
		int[] intNum = new int[10];
		for (int i = 0; i < intNum.length; i++) {
			System.out.println(intNum[i]);
		}
		
		System.out.println();
		
		String str1 = "0123456789";
		int str1Length = str1.length();
		//길이를 구하는 메소드는 한번만 호출해서 변수에 담아서 사용
		for (int i = 0; i < str1Length; i++) {
			System.out.println(str1.substring(i, i+1));
		}
		System.out.println();
		

	}

}
