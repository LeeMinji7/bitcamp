package ch02_기본프로그래밍.programming;

import java.util.Scanner;

public class No6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨온도를 입력하시오: ");
		double f = sc.nextDouble();
		
		double c = (f-32)*5.0/9.0;
		
		System.out.println("섭씨온도는 " + c + "도 입니다.");
	}

}
