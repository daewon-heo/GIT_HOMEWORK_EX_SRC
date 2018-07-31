package com.homework.home180725.silsub;

public class CharacterProcess {
	
	public CharacterProcess(){}
	
	//전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
	public int countAlpha(String s) throws CharCheckException {
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == ' '){
				throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
			}
			
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
				count++;
			}
		}
		return count;
	}
	//단, 공백문자가 있으면, CharCheckException 발생
}
