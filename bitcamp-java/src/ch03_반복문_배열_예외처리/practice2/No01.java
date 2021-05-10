package ch03_반복문_배열_예외처리.practice2;

import java.util.Scanner;

public class No01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		int n = sc.nextInt();
		
		if(n>=19)
			System.out.println("성년");
		else
			System.out.println("미성년");
	}

}
