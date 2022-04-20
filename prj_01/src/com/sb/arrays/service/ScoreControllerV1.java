package com.sb.arrays.service;

public class ScoreControllerV1 {
	public static void main(String[] args) {
		ScoreServiceV1 score = new ScoreServiceV1(100);
		score.makeScore();
		score.printScore();
		score.printNo1Score();
		
	}
}
