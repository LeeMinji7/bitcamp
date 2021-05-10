package ch02_기본프로그래밍.programming;

import java.util.Scanner;

public class No4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 단위 정수를 입력하세요: ");
		int second = sc.nextInt();
		
		int hour = second/3600;
		int minute = (second-hour*3600)/60;
		int s = (second-minute*60);
		System.out.println(hour + "시간 " + minute +"분 " + s + "초");
	}

}
