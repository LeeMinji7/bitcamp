package ch03_�ݺ���_�迭_����ó��.practice1;

import java.util.Scanner;

public class No03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�>> ");
		int n = sc.nextInt();
		
		for(int i=n; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
