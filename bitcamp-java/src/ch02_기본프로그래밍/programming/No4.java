package ch02_�⺻���α׷���.programming;

import java.util.Scanner;

public class No4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� ������ �Է��ϼ���: ");
		int second = sc.nextInt();
		
		int hour = second/3600;
		int minute = (second-hour*3600)/60;
		int s = (second-minute*60);
		System.out.println(hour + "�ð� " + minute +"�� " + s + "��");
	}

}
