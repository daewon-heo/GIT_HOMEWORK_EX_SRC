package com.homework.home180725.com.week4;

import java.util.Scanner;

public class ExamTest {
	public static void main(String[] args) {
		ExamString exs = new ExamString();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(exs.preChar(str));
		
		System.out.println(str + "에서 " + ch + "는 " + exs.charSu(str, ch) + "개");
	}
}
