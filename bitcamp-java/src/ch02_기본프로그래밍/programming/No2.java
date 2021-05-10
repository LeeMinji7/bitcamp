package ch02_기본프로그래밍.programming;

import java.util.Scanner;

public class No2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();
		
		System.out.println(n + "의 제곱은 " + n*n);
		
	}

}
