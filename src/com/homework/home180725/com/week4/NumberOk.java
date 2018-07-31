package com.homework.home180725.com.week4;

import java.util.Scanner;

public class NumberOk {
	public static int rand;

	public static void main(String[] args) {
		NumberOk nbo = new NumberOk();
		Scanner sc = new Scanner(System.in);

		loop:
		while (true) {
			rand = (int) (Math.random() * 100) + 1;
			int count = 0;
			System.out.println("1~100 임의의 정수 발생 : " + rand);

			while (true) {
				count++;
				int chk = nbo.questionNumber(nbo.getNumber());
				if (chk == 0) {
					System.out.println("맞았습니다.(" + count + "번)");
					System.out.println("계속 하시겠습니까?(y/n)");
					char ch = sc.nextLine().toUpperCase().charAt(0);
					if (ch == 'N') {
						System.out.println("프로그램을 종료합니다.");
						break loop;
					}else {
						break;
					}
				} else if (chk == 1) {
					System.out.println("크다");
				} else if (chk == -1) {
					System.out.println("작다");
				}
			}
		}
	}

	public int getNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}

	public int questionNumber(int num) {
//		int result = 0;
//		if (rand == num) result = 0;
//		else if (rand < num) result = 1;
//		else if (rand > num)result = -1;
//		return result;
		
		return (rand > num)? -1 : (rand < num)? 1 : 0;
	}
}
