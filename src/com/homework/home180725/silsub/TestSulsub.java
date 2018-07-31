package com.homework.home180725.silsub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestSulsub {

	public static void main(String[] args) {
		TestSulsub ts = new TestSulsub();
//		ts.silsub1();
		ts.silsub2();
	}

	public void silsub1() {
		CharacterProcess ch = new CharacterProcess();
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("문자열 입력 : ");
		
		try {
			String str = bin.readLine();
			System.out.println(str + "에서 영문자는 " + ch.countAlpha(str) + "개 입니다.");
		} catch (IOException | CharCheckException e) {
			System.out.println(e.getMessage());
		}
	}

	public void silsub2() {
		NumberProcess np = new NumberProcess();
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();

		try {
			if (np.checkDouble(num1, num2)) {
				System.out.println(num1 + "은 " + num2 + "의 배수이다");
			} else {
				System.out.println(num1 + "은 " + num2 + "의 배수가 아니다");
			}
		} catch (NumberRangeException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
	}
}
