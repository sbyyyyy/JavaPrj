package com.sb.arrays.service;

public class ScoreServiceV2 {
	private int[] intKor;

	public ScoreServiceV2() {
		this(10);
	}

	public ScoreServiceV2(int length) {
		intKor = new int[length];
	}

	public void makeScore() {
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = (int) (Math.random() * 50) + 51;
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
	}
}
