package com.sb;

public class ToeicExam extends Exam {
	private int com;

	public ToeicExam() {
		this(0);
	}

	public ToeicExam(int com) {
		super();
		this.com = com;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		return super.total() + getCom();
	}

}
