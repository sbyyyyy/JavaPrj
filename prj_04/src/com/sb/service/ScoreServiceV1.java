package com.sb.service;

import java.util.Scanner;

import com.sb.score.ScoreVO;

public class ScoreServiceV1 {
	protected ScoreVO[] scores;

	public ScoreServiceV1() {
		this(10);
	}
	
	public ScoreServiceV1(int length) {
		scores = new ScoreVO[length];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreVO();
		}
	}
	
	public ScoreServiceV1(String[] stNames) {
		int length = stNames.length;
		scores = new ScoreVO[length];
		for (int i = 0; i < stNames.length; i++) {
			scores[i] = new ScoreVO();
			scores[i].setStName(stNames[i]);
		}
	}
}
