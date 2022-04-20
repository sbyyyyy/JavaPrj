package classes.service;

import java.util.Scanner;

import classes.utils.Line;

public class ScoreServiceV1 {
	protected String[] students;
	protected int[] intKor;
	protected int lineLength;
	protected Scanner scan;
	
	public ScoreServiceV1() {
		this(10);
	}
	public ScoreServiceV1(int length) {
		students = new String[length];
		intKor = new int[length];
		lineLength = 50;
		scan = new Scanner(System.in);
	}
	
	public int input() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("빛나라 고교 성적처리 v1");
		System.out.println(Line.dLine(lineLength));
		
		int i = 0;
		
		for (i = 0; i < students.length; i++) {
			int stNum = i +1;
			System.out.printf("%d 번 학생 이름(END : 중단)", stNum);
			String strName = scan.nextLine();
			
			if(strName.equals("END")) {
				break;
			}
			
			students[i] = strName;
			
			System.out.printf("%d 번 국어점수 : >", stNum);
			//int intScore = Integer.parseInt(scan.nextLine());
			//intKor[i] = intScore;
			int intScore = 0;
			String strScore = scan.nextLine();
			if(strScore.equals("")) {
				System.out.println("점수는 숫자만 가능");
			} else {
				intScore = Integer.valueOf(strScore);
			}
			intKor[i] = intScore;
		}
		return 0;
	}
	
	public void print() {
		for(int i = 0; i < students.length; i++) {
			System.out.printf("%s : %d\t", students[i], intKor[i]);
		}
		System.out.println();
		System.out.println("완료");
	}
	
}
