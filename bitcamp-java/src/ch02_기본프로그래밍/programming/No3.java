package ch02_�⺻���α׷���.programming;

import java.util.Scanner;

public class No3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������� �ظ� ��������? ");
		int r = sc.nextInt();
		
		System.out.print("������� ���̴�? ");
		int h = sc.nextInt();
		
		System.out.println("������� ���Ǵ� " + r*r*h*3.14);
	}

}
