package com.sb.classes.exec;

import com.sb.classes.service.ScoreServiceV1;

public class String2IntV6 {
	public static void main(String[] args) {
		ScoreServiceV1 service = new ScoreServiceV1(2);
		int intResult = service.input();
		System.out.println((intResult < 0) ? "\n#입력 도중 중단함":"\n#입력을 모두 마침");
	}
}
