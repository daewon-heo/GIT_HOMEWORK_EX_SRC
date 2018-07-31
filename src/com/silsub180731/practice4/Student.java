package com.silsub180731.practice4;

public class Student {
	private int sno;
	private String sname;
	private int kor,eng,mat,tot,avg;
	
	public Student() {
	}
	
	public Student(int sno, String sname, int kor, int eng, int mat, int tot, int avg) {
		this.sno = sno;
		this.sname = sname;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return "번호 : " + sno + ", 이름 : " + sname + ", 국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + mat + ", 총점 : " + tot + ", 평균 : " + avg;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}
}
