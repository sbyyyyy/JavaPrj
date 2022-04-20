package com.sb.student.service;

import java.util.Scanner;

import com.sb.arrays.service.Line;

/*
 * ServiceV2에서 ServiceV2를 상속 받았다.
 * 상속을 받으면 ServiceV1에 선언된 변수, method를 그대로 물려받는다
 * 단, 생성자 제외
 * 
 * 상속 키워드가 extends인 것에 주목!!
 */

public class StudentServiceV2 extends StudentServiceV1 {
	private String[] strStudents;
	private Scanner scan;

	public StudentServiceV2() {
		this(10);
	}

	public StudentServiceV2(int length) {
		strStudents = new String[length];
		scan = new Scanner(System.in);
	}

	@Override
	public int inputStudent() {
		Line.dLine(50);
		System.out.println("학생정보 입력 v2");
		Line.sLine(50);

		int index = 0;

		for (index = 0; index < strStudents.length; index++) {
			System.out.printf("%d 번 학생 입력(QUIT:중단) >", index + 1);
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {

				break;
			}
			strStudents[index] = strName;
			
		}
		if (index < strStudents.length) {
			System.out.println("입력이 중단 되었습니다.");
		} else {
			System.out.println("입력을 모두 마쳤습니다.");
		}
		System.out.println("학생수: " + index);
		return 0;
	}

	@Override
	public void printStudent() {
		for (int i = 0; i < strStudents.length; i++) {
			boolean bYes = strStudents[i] == null;
			if (bYes)
				break;
			System.out.printf("* %s\t", strStudents[i]);

		}
	}
}
