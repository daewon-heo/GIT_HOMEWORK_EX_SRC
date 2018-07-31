package com.homework.home180725.com.week4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestWork1 {
	public void test1(){
		Calendar cal = new GregorianCalendar();
	
		cal.set(2011, 2 ,21);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 DD일 HH시 mm분 ss초 E요일");
		System.out.println(sdf.format(cal.getTime()));
	}
}
