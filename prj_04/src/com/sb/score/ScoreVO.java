package com.sb.score;

/*
 * VO 클래스
 * value object 클래스
 * 
 */

public class ScoreVO {

	/*
	 * 인스턴스 변수 or 클래스 변수(static) 필드 멤버 or 메소드 멤버
	 */

	private String stName;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float fAvg;
	
	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}



	public int getIntEng() {
		return intEng;
	}
	
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	public int getIntSum() {
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		return intSum;
	}

	public float getfAvg() {
		fAvg = (float)getIntSum()/3.0f;
		return fAvg;
	}

	@Override
	public String toString() {
		return "ScoreV0 [이름=" + stName + ", 국어=" + intKor + ", 영어=" + intEng + ", 수학=" + intMath
				+ ", 총점=" + getIntSum() + ", 평균=" + getfAvg() + "]";
	}
	
}
