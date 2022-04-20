package com.sb.arrays.service;

public class ScoreServiceV3 {
	private int[] intKor;
	private int sum = 0;

	public ScoreServiceV3() {
		this(10);
	}

	public ScoreServiceV3(int length) {
		intKor = new int[length];
	}

	public void makeScore() {
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = (int) (Math.random() * 100 + 1);
		}
	}

	public void sumScore() {
		for (int i = 0; i < intKor.length; i++) {
			sum += intKor[i];
		}
	}

	public void printScore() {
		Line.dLine(100);
		System.out.println("국어 성적 일람표");
		Line.dLine(100);

		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d:%d\t", (i + 1), intKor[i]);
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n총점 : " + sum);
	}
}
