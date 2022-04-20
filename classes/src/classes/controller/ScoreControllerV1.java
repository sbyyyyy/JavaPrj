package classes.controller;

import classes.service.ScoreServiceV1;
import classes.utils.Line;

public class ScoreControllerV1 {
	public static void main(String[] args) {
		ScoreServiceV1 service = new ScoreServiceV1(3);
		
		service.input();
		service.print();
		Line.dLine(0);
		

	}
}
