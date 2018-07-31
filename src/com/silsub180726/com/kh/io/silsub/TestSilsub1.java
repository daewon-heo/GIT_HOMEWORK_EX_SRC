package com.silsub180726.com.kh.io.silsub;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import com.silsub180726.com.kh.io.controller.TestDataInputStream;

public class TestSilsub1 {

	public static void main(String[] args) {
		TestSilsub1 ts = new TestSilsub1();
//		ts.fileSave();
//		ts.fileRead();
	}
	
	public void fileSave(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		FileWriter fr = null;
		
		try {
			System.out.print("만들 파일명 입력 : ");
			String filename = br.readLine();
			fr = new FileWriter(filename);
			
			do{
				System.out.println("파일에 저장할 내용을 입력하시오");
				String msg = br.readLine(); 
				if(msg.equals("exit"))
					break;
				
				fr.write(msg);
				fr.flush();
			}
			while(true);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("파일에 성공적으로 저장되었습니다.");
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileRead(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileReader fr = null;
		StringBuilder sb = new StringBuilder();
		
		System.out.print("읽을 파일명 입력 : ");
		
		try {
			String filename = br.readLine();
			fr = new FileReader(filename);
			
			while(fr.read() != -1){
				sb.append((char)fr.read());
			}
			
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
