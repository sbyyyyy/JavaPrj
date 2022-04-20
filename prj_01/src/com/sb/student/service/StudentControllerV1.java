package com.sb.student.service;

public class StudentControllerV1 {
	public static void main(String[] args) {
		StudentServiceV1 stService = new StudentServiceV1(5);
		
		stService.inputStudent();
		stService.printStudent();
	}
}
