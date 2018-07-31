package com.homework.home180725.silsub;

public class NumberProcess {
	
	public NumberProcess(){}
	
	//  임의의 정수 두개를 전달받아, 첫번째 수가 두번째수의 배수인지 확인하고
	//  배수가 맞으면 true 를 리턴하고, 아니면 false를 리턴함
	//  단, 전달된 첫번째와 두번째 수가 1~100사이의 값이 아니면
	//	NumberRangeException 발생시킴
	//	에러메시지 : "1부터 100사이의 값이 아닙니다."
	public boolean checkDouble(int a, int b) throws NumberRangeException{
		boolean result = true;
		if( (a <= 100 && a >= 0) && (b <= 100 && b >= 0)){
			if(a%b == 0){
				result = true;
			}else{
				result = false;
			}
		}else{
			throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
		}
		return result;
	}
}
