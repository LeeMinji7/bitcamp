package ch02_�⺻���α׷���.programming;

import java.util.Scanner;

public class No6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ȭ���µ��� �Է��Ͻÿ�: ");
		double f = sc.nextDouble();
		
		double c = (f-32)*5.0/9.0;
		
		System.out.println("�����µ��� " + c + "�� �Դϴ�.");
	}

}
