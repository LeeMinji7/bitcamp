package ch02_�⺻���α׷���.programming;

import java.util.Scanner;

public class No7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		int n = sc.nextInt();
		
		boolean b1 = ((n%4==0) && (n%5)==0);
		boolean b2 = ((n%4==0) ^ (n%5)==0);
		boolean b3 = ((n%4==0) || (n%5)==0);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
	}

}
