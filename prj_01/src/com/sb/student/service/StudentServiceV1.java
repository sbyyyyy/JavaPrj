package com.sb.student.service;

import java.util.Scanner;

import com.sb.arrays.service.Line;

public class StudentServiceV1 {
	private String[] strStudents;
	private Scanner scan;

	public StudentServiceV1() {
		this(10);
	}

	public StudentServiceV1(int num) {
		strStudents = new String[num];
		scan = new Scanner(System.in);
	}

	public int inputStudent() {
		System.out.println("학생 이름 입력 > ");
		for (int i = 0; i < strStudents.length; i++) {
			strStudents[i] = scan.nextLine();
			this.printStudent();
		}
		System.out.println("\n입력이 종료 되었습니다!");
		Line.dLine(100);
		return 0;
	}

	public void printStudent() {
		for (int i = 0; i < strStudents.length; i++) {
			boolean bYes = strStudents[i] == null;
			if (bYes)
				break;
			System.out.printf("%s\t", strStudents[i]);

		}
	}
}
