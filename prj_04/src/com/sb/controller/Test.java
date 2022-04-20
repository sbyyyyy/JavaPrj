package com.sb.controller;

import com.sb.score.ScoreVO;

public class Test {

	public static void main(String[] args) {
		ScoreVO score = new ScoreVO();
		score.setStName("홍길동");
		score.setIntEng(100);
		score.setIntKor(50);
		score.setIntMath(80);
		System.out.println(score.toString());
	}
}
