package com.sb.service;

import com.sb.score.ScoreVO;
import com.sb.score.utils.Line;
import com.sb.score.utils.Score;

public class ScoreServiceV3{
	
	protected ScoreVO[] scores;
	
	public ScoreServiceV3() {
		this(10);
	}

	public ScoreServiceV3(int length) {
		scores = new ScoreVO[length];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreVO();
		}
	}

	public ScoreServiceV3(String[] stNames) {
		int length = stNames.length;
		scores = new ScoreVO[length];
		for (int i = 0; i < stNames.length; i++) {
			scores[i] = new ScoreVO();
			scores[i].setStName(stNames[i]);
		}
	}

	public void makeScore() {
		for (int i = 0; i < scores.length; i++) {
			scores[i].setIntEng((int)(Math.random()*100));
			scores[i].setIntKor((int)(Math.random()*100));
			scores[i].setIntMath((int)(Math.random()*100));
		}
	}
	public void printScore() {
		float[] totals = new float[5];
		for (int i = 0; i < scores.length; i++) {

			System.out.printf("%s\t", scores[i].getStName());
			System.out.printf("%d\t", scores[i].getIntKor());
			System.out.printf("%d\t", scores[i].getIntEng());
			System.out.printf("%d\t", scores[i].getIntMath());
			System.out.printf("%d\t", scores[i].getIntSum());
			System.out.printf("%f\n", scores[i].getfAvg() / scores.length);

			totals[Score.I_KOR]= scores[i].getIntKor();
			totals[Score.I_ENG]= scores[i].getIntEng();
			totals[Score.I_MATH]= scores[i].getIntMath();
			totals[Score.I_SUM]= scores[i].getIntSum();
			totals[Score.I_AVG]= scores[i].getfAvg();
		}
		
		System.out.println(Line.sLine(50));
		System.out.printf("%s\t", "총점");
		System.out.printf("%f\t", totals[Score.I_KOR]);
		System.out.printf("%f\t", totals[Score.I_ENG]);
		System.out.printf("%f\t", totals[Score.I_MATH]);
		System.out.printf("%f\t", totals[Score.I_SUM]);
		System.out.printf("%f\n", totals[Score.I_AVG]);
		System.out.println(Line.dLine(50));
	}
}
