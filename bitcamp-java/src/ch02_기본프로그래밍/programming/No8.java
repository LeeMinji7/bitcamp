package ch02_기본프로그래밍.programming;

import java.util.Scanner;

public class No8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("0~999 사이의 숫자를 입력하세요: ");
		int n = sc.nextInt();
		
		int hundreds = n/100;
		int tens = (n-(100*hundreds))/10;
		int units = (n-(100*hundreds))%10;
		System.out.println("각 자리의 합 = " + (hundreds+tens+units));
	}

}
