package com.silsub180731.practice4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import jdk.jfr.events.FileWriteEvent;

public class TestProperties {

	public static void main(String[] args) {
		TestProperties tp = new TestProperties();
		Student[] sr = tp.readFile();
		tp.printConsole(sr);
		tp.saveXMLFile(sr);
	}
	
	public Student[] readFile(){
		Properties ps = new Properties();
		Student[] sr = new Student[3];;
		try {
			ps.load(new FileInputStream("score.txt"));
			String[] snoArr = ps.getProperty("sno").split(",");
			String[] snameArr = ps.getProperty("sname").split(",");
			String[] matArr = ps.getProperty("mat").split(",");
			String[] engArr = ps.getProperty("eng").split(",");
			String[] korArr = ps.getProperty("kor").split(",");
			
			for(int i = 0 ; i < snoArr.length;i++) {
				int sno = Integer.parseInt(snoArr[i]);
				int kor = Integer.parseInt(korArr[i]);
				int eng = Integer.parseInt(engArr[i]);
				int mat = Integer.parseInt(matArr[i]);
				int sum = kor + eng + mat;
				int avg = sum/3;
				sr[i] = new Student(sno, snameArr[i], kor, eng, mat, sum, avg);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sr;
	}
	
	public void printConsole(Student[] sr) {
		for(Student st : sr) {
			System.out.println(st);
		}
	}
	
	public void saveXMLFile(Student[] sr) {
		Properties prop = new Properties();
		
		for(Student st : sr) {
			prop.setProperty(String.valueOf(st.getSno()), st.getSname() + "," + st.getKor() + "," + st.getEng() + "," + st.getMat());
		}
		
		try {
			prop.storeToXML(new FileOutputStream("student.xml"), "student.xml");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
