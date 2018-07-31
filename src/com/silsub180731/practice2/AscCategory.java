package com.silsub180731.practice2;

import java.util.Comparator;

public class AscCategory implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Book b1 = (Book)o1;
		Book b2 = (Book)o2;
		
		int result = 0;
		if(b1.getCategory() > b2.getCategory()){
			result = 1;
		}else if(b1.getCategory() < b2.getCategory()){
			result = -1;
		}
		return result;
	}

}
