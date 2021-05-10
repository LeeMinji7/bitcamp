package ch02_기본프로그래밍.programming;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("피라미드의 층수를 입력하세요: ");
		int n = sc.nextInt();
	
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
