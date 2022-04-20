package com.sb.service;

import com.sb.score.ScoreVO;
import com.sb.score.utils.Line;

public class ScoreServiceV2{
	
	public ScoreVO[] scores;
	
	public ScoreServiceV2() {
		this(10);
	}

	public ScoreServiceV2(int length) {
		scores = new ScoreVO[length];
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreVO();
		}
	}

	public ScoreServiceV2(String[] stNames) {
		int length = stNames.length;
		
		scores = new ScoreVO[length];
		
		for (int i = 0; i < stNames.length; i++) {
			scores[i] = new ScoreVO();
			scores[i].setStName(stNames[i]);
		}
	}

	public void makeScore() {
		for (int i = 0; i < scores.length; i++) {
			scores[i].setIntKor((int)(Math.random()*100));
			scores[i].setIntEng((int)(Math.random()*100));
			scores[i].setIntMath((int)(Math.random()*100));
		}
	}
	public void printScore() {
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		int sumTotal = 0;
		float avgResult = 0;

		for (int i = 0; i < scores.length; i++) {

			System.out.printf("%s\t", scores[i].getStName());
			System.out.printf("%d\t", scores[i].getIntKor());
			System.out.printf("%d\t", scores[i].getIntEng());
			System.out.printf("%d\t", scores[i].getIntMath());
			System.out.printf("%d\t", scores[i].getIntSum());
			System.out.printf("%4.2f\n", scores[i].getfAvg() / scores.length);

			korTotal += scores[i].getIntKor();
			engTotal += scores[i].getIntEng();
			mathTotal += scores[i].getIntMath();
			sumTotal += scores[i].getIntSum();

			/*
			 * 평균계산 주의
			 */

			avgResult += scores[i].getfAvg();
		}
		System.out.println(Line.sLine(50));
		System.out.printf("%s\t", "총점");
		System.out.printf("%d\t", korTotal);
		System.out.printf("%d\t", engTotal);
		System.out.printf("%d\t", mathTotal);
		System.out.printf("%d\t", sumTotal);
		System.out.printf("%4.2f\n", avgResult);
		System.out.println(Line.dLine(50));
	}
}
