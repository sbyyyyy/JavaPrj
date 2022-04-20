package com.sb.controller;

import com.sb.service.ScoreServiceV2;

public class Controller {
	public static void main(String[] args) {
		String[] stNames = {"홍길동", "이몽룡", "성춘향", "장보고", "임꺽정"};
		
		ScoreServiceV2 service = new ScoreServiceV2(stNames);
		service.makeScore();
		service.printScore();
	}
}
