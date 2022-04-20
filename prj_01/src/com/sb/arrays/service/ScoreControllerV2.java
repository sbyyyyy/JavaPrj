package com.sb.arrays.service;

public class ScoreControllerV2 {
	public static void main(String[] args) {
		ScoreServiceV2 score = new ScoreServiceV2(100);
		score.makeScore();
		score.printScore();
	}
}
