package ch03_반복문_배열_예외처리.practice1;

import java.util.Scanner;

public class No04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
		char c = sc.next().charAt(0);
		
		for(char i=c; i >= 'a'; i--) {
			for(char j='a'; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
