package ch02_기본프로그래밍.programming;

import java.util.Scanner;

public class No7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		int n = sc.nextInt();
		
		boolean b1 = ((n%4==0) && (n%5)==0);
		boolean b2 = ((n%4==0) ^ (n%5)==0);
		boolean b3 = ((n%4==0) || (n%5)==0);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
	}

}
