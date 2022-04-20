package com.sb.classes.service;

import java.util.Scanner;

import com.sb.classes.utils.Line;

public class ScoreServiceV2 {
	protected String[] students;
	protected int[] intKor;

	public ScoreServiceV2() {
		this(10);
	}

	public ScoreServiceV2(int length) {
		students = new String[length];
		intKor = new int[length];
	}
	public ScoreServiceV2(String[] students) {
		this.students = students;
		this.intKor = new int[this.students.length];
	}
	
	public void print() {
		System.out.println(intKor.length);
	}
	
}