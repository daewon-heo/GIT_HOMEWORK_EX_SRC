package com.silsub180726.com.kh.io.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//[실습문제 3]
//▶ 클래스 : com.kh.io.controller.TestDataInputStream.java
//=> employee.dat 파일의 내용을 데이터 종류별로 읽어서
//=> Employee 객체에 저장하고
//=> 출력 확인함

public class TestDataInputStream {
	public static void main(String[] args) {
		Employee emp = new Employee();
		try (DataInputStream din = new DataInputStream(new FileInputStream("employee.txt"));
				DataOutputStream dout = new DataOutputStream(new FileOutputStream("employee.txt"));) {
			
			dout.writeChar('c');
			dout.writeUTF("String");
			dout.writeInt(10);
			dout.writeDouble(10.20);
			dout.writeBoolean(true);
			
			emp = new Employee(din.readChar(), din.readUTF(),  din.readInt(), din.readDouble(), din.readBoolean());
			
			System.out.println(emp.toString());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (EOFException e) {
			System.out.println(e.getMessage());
			System.out.println("파일 읽기 완료!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

class Employee {
	char ch;
	String str;
	int numInt;
	double numDouble;
	boolean bool;
	
	public Employee() {}

	public Employee(char ch, String str, int numInt, double numDouble, boolean bool) {
		this.ch = ch;
		this.str = str;
		this.numInt = numInt;
		this.numDouble = numDouble;
		this.bool = bool;
	}
	
	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getNumInt() {
		return numInt;
	}

	public void setNumInt(int numInt) {
		this.numInt = numInt;
	}

	public double getNumDouble() {
		return numDouble;
	}

	public void setNumDouble(double numDouble) {
		this.numDouble = numDouble;
	}

	public boolean isBool() {
		return bool;
	}

	public void setBool(boolean bool) {
		this.bool = bool;
	}

	@Override
	public String toString() {
		return "char : " + this.ch + ", string : " + str + ", Integer : " + this.numInt + ", Double : " + this.numDouble
				+ ", boolean : " + this.bool;
	}
}
