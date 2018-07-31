package com.homework.home180725.com.week4;

import java.util.StringTokenizer;

public class TestWork2 {
	public void test2(){
		String str = "J a v a  P r o g r a m ";
				
		StringTokenizer strToken = new StringTokenizer(str, " ");
		char[] chArr = new char[strToken.countTokens()];
		
		int num = 0;
		while(strToken.hasMoreTokens()){
			chArr[num++]=strToken.nextToken().charAt(0);
		}
		
		System.out.println("토큰 처리전 글자 출력 : " + str);
		System.out.println("토큰 처리전 글자 개수 : " + str.length());
		System.out.println("토큰 처리 후 글자 개수 : " + chArr.length);

		for (int i = 0; i < chArr.length; i++) {
			System.out.print(chArr[i]);
		}
		System.out.println();
		
		for (int i = 0; i < chArr.length; i++) {
			System.out.print(String.valueOf(chArr[i]).toUpperCase());
		}
	}
}
