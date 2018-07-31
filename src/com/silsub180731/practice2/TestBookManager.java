package com.silsub180731.practice2;

import java.util.Scanner;

public class TestBookManager {
	static BookManager bm;
	public static void main(String[] args) {

		bm = new BookManager();
		do {
			TestBookManager.menu();
		} while (true);
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 도서 관리 프로그램 ***");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서정보 정렬후 출력");
		System.out.println("3. 도서 삭제");
		System.out.println("4. 도서 검색 출력");
		System.out.println("5. 전체 출력");
		System.out.println("6. 끝내기");
		System.out.print("번호 선택 : ");
		int num = Integer.parseInt(sc.nextLine());

		switch (num) {
		case 1:
			bm.addBook(TestBookManager.inputBook());
			System.out.println("도서 추가 완료");
			break;
		case 2:
			bm.printBookList(bm.sortedBookList());
			break;
		case 3:
			bm.deleteBook(TestBookManager.inputBookTitle());
			break;
		case 4:
			int index = bm.searchBook(TestBookManager.inputBookTitle());
			if(index == -1){
				System.out.println("검색한 책이 없습니다.");
			}else{
				bm.printBook(index);
			}
			break;
		case 5:
			bm.displayAll();
			break;
		case 6:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		default:
			break;
		}
	}

	public static Book inputBook() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("도서번호 입력 : ");
		String bNo = sc.nextLine();
		
		System.out.print("도서 분류 코드 입력 (1.인문/2.자연과학/3.의료/4.기타) : ");
		int category = Integer.parseInt(sc.nextLine());
		
		System.out.print("책제목 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 입력 : ");
		String author = sc.nextLine();
		
		return new Book(bNo, category, title, author);
	}

	public static String inputBookTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("타이틀 입력 : ");

		return sc.nextLine();
	}

}
