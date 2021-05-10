package ch02_기본프로그래밍.programming;

import java.util.Scanner;

public class No9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("전공 이수 학점 : ");
		int major = sc.nextInt();
		
		System.out.print("교양 이수 학점 : ");
		int culture = sc.nextInt();
		
		System.out.print("일반 이수 학점 : ");
		int normal = sc.nextInt();
		
	
		if((major >= 70) && (((culture >= 30) && (normal >= 30)) || (culture+normal) >= 80))
			System.out.println("졸업 가능");
		else
			System.out.println("졸업 불가능");

		
		
		
	}

}
