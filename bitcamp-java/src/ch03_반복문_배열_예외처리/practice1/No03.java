package ch03_반복문_배열_예외처리.practice1;

import java.util.Scanner;

public class No03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>> ");
		int n = sc.nextInt();
		
		for(int i=n; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
