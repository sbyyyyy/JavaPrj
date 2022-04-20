package com.sb.classes.service;

import java.util.Scanner;

import com.sb.classes.utils.Line;

public class ScoreServiceV1 {
	protected String[] student;
	protected int[] intKor;
	protected Scanner scan;
	protected int lineLength;

	public ScoreServiceV1() {
		this(10);
	}

	public ScoreServiceV1(int length) {
		student = new String[length];
		intKor = new int[length];
		scan = new Scanner(System.in);
		lineLength = 50;
	}

	public int input() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("대한 고교 성적처리 V2");
		System.out.println(Line.dLine(lineLength));
		int index = 0;

		while (index < student.length) {
			String strKor = "";

			try {
				System.out.println("이름 (END:중단) >> ");
				String strName = scan.nextLine();
				if (strName.equals("END"))
					return -1;

				System.out.println("점수(정수로 입력, END:중단) >>");
				strKor = scan.nextLine();
				if (strKor.equals("END"))
					return -1;

				student[index] = strName;
				intKor[index] = Integer.parseInt(strKor);

				index++;
			} catch (Exception e) {
				System.out.println("입력값" + strKor + "는 정수로 변경 불가");
				System.out.println("\n**점수는 정수로만 입력해주세요**");
			}
		}

		System.out.println("------결과------");
		for (int i = 0; i < student.length; i++) {
			System.out.print(student[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < intKor.length; i++) {
			System.out.print(intKor[i] + "\t");
		}

		return 0;

	}
}