package com.silsub180727.test.bundle.model;

import java.time.chrono.MinguoChronology;
import java.util.ArrayList;

public class Function {
	private int[] range;
	
	public Function() {
		range = new int[7];
	}
	
	public int[] initFunction(){
		int[] arr = new int[7];
		
		int rand;
		boolean result;
		
		for (int i = 0; i < arr.length; i++) {
			result = false;
			// i = 1
			do{
				rand = (int)(Math.random()*30) + 1;
				
				if(i == 0){
					break;
				}else{
					for (int j = 0; j < i; j++) {
						if(arr[j] == rand){
							result = true;
							break;
						}else{
							result = false;
						}
					}
				}
			}while(result);
			
			arr[i] = rand;
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]){
					swap(arr, j, j+1);
				}
			}
		}
		
		return arr;
	}
	
	public void myFunction(){
		range = initFunction();
		
		// 배열 출력
		System.out.println("---- 배열 출력 ----");
		for (int i = 0; i < range.length; i++) {
			System.out.print(range[i] + " ");
		}
		System.out.println();
		
		int min = 30;
		int minCnt = 0;
		String result = "";
		
		for (int i = 0; i < range.length-1; i++) {
			int num = range[i+1] - range[i];
			
			if(num < min){
				min = num;
				minCnt = 0;
			}
		}
		System.out.println("가장 가까운 수의 차이 : " + min);
		
		
		for (int i = 0; i < range.length-1; i++) {
			int num = range[i+1] - range[i];
			
			if(num == min){
				minCnt++;
				result += "(" + range[i] + "," + range[(i+1)] + ") ";
			}
		}
		
		System.out.println("가장 쌍의 개수 : " + minCnt);
		System.out.println("가장 가까운 쌍 : " + result);
	}
	
	public int[] swap(int[] arr, int src, int dst){
		int temp = arr[src];
		arr[src] = arr[dst];
		arr[dst] = temp;
		return arr;
	}
}
