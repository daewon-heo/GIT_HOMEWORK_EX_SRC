package com.homework.home180727.io.silsub1;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyNote {
	private Scanner sc = new Scanner(System.in);

	public MyNote() {
	}

	public void fileSave() {
		// 파일을 새로 생성하여 내용을 저장하느 ㄴ메소드
		// StringBuilder or StringBuffer
		StringBuilder sb = new StringBuilder();

		System.out.println("파일에 저장할 내용을 입력하세요.");

		while (true) {
			// 한 줄 씩 입력 받기
			String str = sc.nextLine();

			if (str.equals("exit"))
				break;

			// 입력받은 내욜을 저장하기
			sb.append(str + "\n");
		}

		System.out.print("저장 하시겠습니까? : ");
		char ch = sc.nextLine().toUpperCase().charAt(0);

		if (ch == 'Y') {
			System.out.print("저장할 파일 명을 입력하세요 : ");
			String name = sc.nextLine();

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(name));) {
				System.out.println(name + " 파일에 저장되었습니다.");
				bw.append(sb.toString());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void fileOpen() {
		// 기존의 파일을 열어 내용을 확인하는 메소드
		System.out.print("열기할 파일명을 입력하세요 : ");
		String name = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(name));) {
			StringBuilder sb = new StringBuilder();

			while (br.ready()) {
				// String str = br.readLine();
				// if( str == null) break;

				sb.append(br.readLine() + "\n");
			}

			System.out.println(sb.toString());

			System.out.println("파일을 성공적으로 불러왔습니다.");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void fileEdit() {
		// 이밎 존재하는 파일에 내욜을 추가하는 메소드
		System.out.print("수정할 파일 명을 입력하세요 : ");
		String str = sc.nextLine();
		
		try(
			BufferedReader br 
				= new BufferedReader(
						new FileReader(str));
			BufferedWriter bw
				= new BufferedWriter(
						new FileWriter(str, true));
				)
		{
			StringBuilder sb = new StringBuilder();
			
			while(br.ready()){
				sb.append(br.readLine() + "\n");
			}
			
			System.out.println("현재 저장된 내용 : ");
			System.out.println(sb.toString());
			
			System.out.println("파일에 추가할 내용을 입력하세요.");
			
			// 기존의 내용을 초기화 하여
			// 새로 입력한 내용만 받기
			sb.setLength(0);
			while(true){
				String str2 = sc.nextLine();
				
				if(str2.equals("exit")) break;
				
				sb.append(str2 + "\n");
			}
			
			System.out.println("수정한내용");
			System.out.println(sb.toString());
			
			System.out.print("수정한 내용을 저장하시겠습니까 ? : ");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			
			if(ch == 'Y'){
				bw.write(sb.toString());
				
				System.out.println(str + " 파일에 수정한 내용이 반영되었습니다.");
			}else{
				System.out.println("수정할 내용이 취소되었습니다.");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
