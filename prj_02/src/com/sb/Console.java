package com.sb;

import java.util.Scanner;

public class Console {
	Exam exam = new ToeicExam();
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 성적을 입력해주세요.");
		System.out.print("> ");
		exam.setKor(scan.nextInt());
		System.out.println("영어 성적을 입력해주세요.");
		System.out.print("> ");
		exam.setEng(scan.nextInt());
		System.out.println("수학 성적을 입력해주세요.");
		System.out.print("> ");
		exam.setMath(scan.nextInt());
		System.out.println("컴퓨터 성적을 입력해주세요.");
		System.out.print("> ");
		((ToeicExam) exam).setCom(scan.nextInt());
	}
	
	public void print() {
		System.out.println("─😊─────────────👍─");
		System.out.println("     총점 : " + exam.total());
		System.out.println("─😊─────────────👍─");
	}
	
}
