package ch02_�⺻���α׷���.programming;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�Ƕ�̵��� ������ �Է��ϼ���: ");
		int n = sc.nextInt();
	
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
