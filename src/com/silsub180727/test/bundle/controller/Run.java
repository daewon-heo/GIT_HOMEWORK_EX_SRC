package com.silsub180727.test.bundle.controller;

import com.silsub180727.test.bundle.model.Function;

public class Run {
	private Function myF;
	
	public Run(){
		myF = new Function();
	}
	
	public static void main(String[] args) {
		Run run = new Run();
		run.myF.myFunction();
	}
}
