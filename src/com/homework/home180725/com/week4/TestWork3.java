package com.homework.home180725.com.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestWork3 {
	public void test3() throws IOException {
		ArrayList<Employee> list = new ArrayList<>();
		final int EMP_MAX = 5;

		while (list.size() < EMP_MAX) {
			BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("사원명 입력 : ");
			String name = bin.readLine();

			System.out.print("나이 입력 : ");
			int age = Integer.parseInt(bin.readLine());

			System.out.print("급여 입력 : ");
			int salary = Integer.parseInt(bin.readLine());

			System.out.print("세율 입력(소수 둘째자리) : ");
			double rate = Double.parseDouble(bin.readLine());

			Employee emp = new Employee(name, age, salary, rate);
			list.add(emp);

			System.out.println("사원 추가 완료");
		}

		// 오름 차순 정렬
		Collections.sort(list);

		for (Employee emp : list) {
			emp.printInfo();
		}
	}
}
