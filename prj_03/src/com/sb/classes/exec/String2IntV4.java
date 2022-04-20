package com.sb.classes.exec;

import java.util.Scanner;

public class String2IntV4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("정수입력(END:종료) >> ");
			String strNum = scan.nextLine();
			if(strNum.equals("END")) {
				break;
			}
			try {
				int intNum = 0;
				intNum = Integer.valueOf(strNum);	
				boolean bEven = intNum % 2 == 0;
				if (bEven) {
					System.out.printf("정수 %d는 짝수\n", intNum);
				} else {
					System.out.printf("정수 %d는 홀수\n", intNum);
				}
			} catch (Exception e) {
				System.out.println("입력한 " + strNum + "는 숫자로 변경 불가!!");
			}
		}// end while
	System.out.println("OVER!!");
	}
}
