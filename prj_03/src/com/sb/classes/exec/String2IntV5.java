package com.sb.classes.exec;

import com.sb.classes.service.ScoreServiceV2;

public class String2IntV5 {
	public static void main(String[] args) {
		ScoreServiceV2 service = new ScoreServiceV2();
		service = new ScoreServiceV2(20);
		
		String[] strNames = {
								"홍길동",
								"이몽룡",
								"성춘향",
								"임꺽정",
								"장보고"
							};
		service = new ScoreServiceV2(strNames);
		service.print();
	}
}
