package ch02_기본프로그래밍.programming;

import java.util.Scanner;

public class No3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("원기둥의 밑면 반지름은? ");
		int r = sc.nextInt();
		
		System.out.print("원기둥의 높이는? ");
		int h = sc.nextInt();
		
		System.out.println("원기둥의 부피는 " + r*r*h*3.14);
	}

}
