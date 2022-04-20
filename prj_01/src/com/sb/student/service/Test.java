package com.sb.student.service;

public class Test {

	public static void main(String[] args) {
		/*
		 * 문자열형 변수는 숫자형, 불린형 변수와 저장방식이
		 * 다르다
		 * 때문에 문자열형 변수에 저장된 문자열을 EQ(==) 비교를
		 * 하는 것은 매우 위험한 코드가 될 수 있다.
		 * 문자열형 변수는 절대 EQ(==) 또는 NOT EQ(!=)를 사용하여
		 * 비교하지 않는다.
		 */
		String str = "홍길동";
		String str2 = new String("홍길동");
		
		System.out.println(str == "홍길동");
		System.out.println(str2 == "홍길동");
		
		System.out.println(str.equals("홍길동"));
		System.out.println(str2.equals("홍길동"));
		
		String strNation = "Republic of Korea";
		boolean bYes = strNation.toUpperCase().equals("REPUBLIC OF KOREA");
		System.out.println(bYes);
		
		String upString = strNation.toUpperCase();
		System.out.println(upString);
		String lowString = strNation.toLowerCase();
		System.out.println(lowString);
		
		System.out.println(strNation.equalsIgnoreCase("RePuBlIc Of kOrEa"));
		
	}

}
