package ch02_�⺻���α׷���.programming;

import java.util.Scanner;

public class No9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �̼� ���� : ");
		int major = sc.nextInt();
		
		System.out.print("���� �̼� ���� : ");
		int culture = sc.nextInt();
		
		System.out.print("�Ϲ� �̼� ���� : ");
		int normal = sc.nextInt();
		
	
		if((major >= 70) && (((culture >= 30) && (normal >= 30)) || (culture+normal) >= 80))
			System.out.println("���� ����");
		else
			System.out.println("���� �Ұ���");

		
		
		
	}

}
