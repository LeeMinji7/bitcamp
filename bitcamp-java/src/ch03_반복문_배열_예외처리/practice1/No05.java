package ch03_�ݺ���_�迭_����ó��.practice1;

import java.util.Scanner;

public class No05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int arr2[] = new int[10];
		
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>> ");
		
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("3�� �����");
		for(int i=0; i<arr.length; i++)
			if(arr[i] % 3 ==0)
				System.out.print(" " + arr[i]);
	}
}
