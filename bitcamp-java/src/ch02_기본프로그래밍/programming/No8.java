package ch02_�⺻���α׷���.programming;

import java.util.Scanner;

public class No8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("0~999 ������ ���ڸ� �Է��ϼ���: ");
		int n = sc.nextInt();
		
		int hundreds = n/100;
		int tens = (n-(100*hundreds))/10;
		int units = (n-(100*hundreds))%10;
		System.out.println("�� �ڸ��� �� = " + (hundreds+tens+units));
	}

}
