package ch02_�⺻���α׷���;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ�: ");
		int time = scanner.nextInt();
		int second = time % 60;
		int minute =  (time / 60) % 60;
		int hour = (time/60) / 60;
		
		System.out.println(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��,");
		System.out.println(second + "���Դϴ�. ");
		
		
		
	}

}
