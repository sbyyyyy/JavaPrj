package com.sb;

public class Program {
	public static void main(String[] args) {
		Exam exam = new ToeicExam();
		Console console = new Console();
		console.input();
		console.print();
	}
}

// Program -> Console -> ToeicExam -> Exam