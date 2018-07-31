package com.homework.home180727.io.view;

import java.util.Scanner;

import com.homework.home180727.io.silsub1.MyNote;

public class MyNoteMenu {
	// 작성한 파일을 화면에 출력하거나
	// 파일을 새롭게 작성할 수 있는
	// 기능을 사용자에게 보여주는 화면을
	// 담당하는 클래스

	public void menu() {
		MyNote mn = new MyNote();

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("----- 0000's MyNote =====");
			System.out.println("1. 파일 저장하기");
			System.out.println("2. 파일 불러오기");
			System.out.println("3. 파일에 내융 추가하기");
			System.out.println("4. 끝내기");
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				mn.fileSave();
				break;
			case 2:
				mn.fileOpen();
				break;
			case 3:
				mn.fileEdit();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		} while (true);
	}
}
