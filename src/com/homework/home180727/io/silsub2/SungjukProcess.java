package com.homework.home180727.io.silsub2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class SungjukProcess {
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SungjukProcess sp = new SungjukProcess();
		sp.sungjukSave();
		sp.scoreRead();
	}

	public void sungjukSave() {
		do {
			System.out.print("국어 점수 입력 : ");
			int kor = Integer.parseInt(sc.nextLine());

			System.out.print("영어 점수 입력 : ");
			int eng = Integer.parseInt(sc.nextLine());

			System.out.print("수학 점수 입력 : ");
			int math = Integer.parseInt(sc.nextLine());

			int sum = kor + eng + math;
			double avg = sum / 3;

			try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.dat", true));) {
				dout.writeInt(kor);
				dout.writeInt(eng);
				dout.writeInt(math);
				dout.writeInt(sum);
				dout.writeDouble(avg);
				dout.flush();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.print("계속 저장하시겠습니까 ? :");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			if (ch == 'Y') {
				continue;
			} else {
				System.out.println("score.dat에 저장 완료!");
				break;
			}

		} while (true);
	}

	public void scoreRead() {
		/*
		 * 1. 파일에 기록된 정보를 국, 영, 수, 총점, 평균 순으로 읽어와서 
		 * 2. 변수에 저장하고 출력하고, 총점의 합, 평균의 합을 구하고
		 * 		단, 평균은 소숫점 둘째자리까지만 출력되게 함 
		 * 3. 전체 총점과 전체 평균을 읽어온 횟수로 나누어 읽은 횟수와 전체총점, 전체 평균 화면
		 * 		출력함 단, 전체 평균은 소숫점 둘째자리까지만 출력되게 함 
		 * 4. 읽기가 끝나면 "score.dat 파일 읽기 완료." 출력
		 */
		try(DataInputStream dis = new DataInputStream(new FileInputStream("score.dat"));)
		{
			int kor = 0;
			int eng = 0;
			int math = 0;
			int sum = 0;
			double avg = 0;
			
			int cnt = 0;
			while(dis.available() > 0) {
				cnt++;
				kor = dis.readInt();
				System.out.print(cnt + "회차 ");
				System.out.print("국어 : " + kor + "\t");
				eng = dis.readInt();
				System.out.print("영어 : " + eng + "\t");
				math = dis.readInt();
				System.out.print("수학 : " + math + "\t\n");
				sum += dis.readInt();
				avg += dis.readDouble();
			}
			System.out.println();
			System.out.println("총점의 합 : " + sum);
			System.out.printf("평균의 합 : %.2f\n", avg/cnt);
			System.out.println("score.dat 파일 읽기 완료.");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
