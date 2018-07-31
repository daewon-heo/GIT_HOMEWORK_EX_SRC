package com.homework.home180727.io.silsub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class BookMananger {
	private Scanner sc = new Scanner(System.in);

	public BookMananger() {
	}
	
	public void fileSave() {
		Book[] books = new Book[5];
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 출간");
		
		Calendar cal = new GregorianCalendar(2010, 2, 10);
		books[0] = new Book("자바", "자바작가", 20000, cal , 0.5);
		
		Calendar cal1 = new GregorianCalendar(2011, 3, 22);
		books[1] = new Book("파이썬", "파이썬작가", 30000, cal1 , 0.1);
		
		Calendar cal2 = new GregorianCalendar(2012, 4, 25);
		books[2] = new Book("C", "C작가", 10000, cal2 , 0.3);
		
		Calendar cal3 = new GregorianCalendar(2008, 7, 5);
		books[3] = new Book("JSP", "JSP작가", 25000, cal3 , 0.2);
		
		Calendar cal4 = new GregorianCalendar(2018, 4, 20);
		books[4] = new Book("DB", "DB작가", 35000, cal4 , 0.1);
		
		try(ObjectOutputStream oOut = 
				new ObjectOutputStream(
						new FileOutputStream("books.txt"))){
			for (int i = 0; i < books.length; i++) {
				oOut.writeObject(books[i]);
			}
			oOut.flush();
			
			System.out.println("books.txt에 저장 완료!");
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void fileRead() {
		Book[] books = new Book[10];
		
		try(ObjectInputStream oin = 
				new ObjectInputStream(
						new FileInputStream("books.txt"))) {
			
			for(int i = 0 ; i < 5; i++) {
				books[i] = (Book)oin.readObject();
			}
			
			for(Book book : books) {
				if(book != null)
					System.out.println(book.toString());
			}
			
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
}
