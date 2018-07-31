package com.silsub180731.practice2;

import java.io.Serializable;

public class Book implements Serializable{
	private String bNo;
	private int category;
	private String title;
	private String author;
	
	public Book() {
	}

	public Book(String bNo, int category, String title, String author) {
		this.bNo = bNo;
		this.category = category;
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "도서번호 : " + bNo + "\t도서분류코드 : " +  category + "\t책제목 : " + title + "\t저자 : " + author;
	}

	public String getbNo() {
		return bNo;
	}

	public void setbNo(String bNo) {
		this.bNo = bNo;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
