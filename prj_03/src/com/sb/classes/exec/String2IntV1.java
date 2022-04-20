package com.sb.classes.exec;

public class String2IntV1 {
	public static void main(String[] args) {
		String strNum = "33";
		int intNum = Integer.parseInt(strNum);
		
		strNum = "33.2";
		float fNum = Float.parseFloat(strNum);
		
		float fSum = intNum + fNum;
		System.out.println(fSum);
	}
}
