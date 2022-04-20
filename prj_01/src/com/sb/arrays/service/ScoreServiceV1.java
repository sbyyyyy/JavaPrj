package com.sb.arrays.service;

public class ScoreServiceV1 {
	private int[] intKor;

	ScoreServiceV1(int size) {
		intKor = new int[size];
	}

	public void makeScore() {
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = (int) (Math.random() * 50) + 51;
		}
	}

	public void printScore() {
		Line.dLine(100);
		System.out.println("국어 성적 일람표");
		Line.sLine(100);
		

		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d:%d\t",(i+1), intKor[i]);
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
	}
	public void printNo1Score() {
		System.out.println("1번 학생 점수 : " + intKor[1]);
	}
}
