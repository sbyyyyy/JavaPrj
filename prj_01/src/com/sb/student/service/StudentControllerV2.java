package com.sb.student.service;

public class StudentControllerV2 {
	public static void main(String[] args) {
		StudentServiceV2 stServiceV2 = new StudentServiceV2(3);
		
		stServiceV2.inputStudent();
		stServiceV2.printStudent();
	}
}
