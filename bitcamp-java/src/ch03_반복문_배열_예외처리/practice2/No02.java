package ch03_�ݺ���_�迭_����ó��.practice2;

import java.util.Scanner;

public class No02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �Է��Ͻÿ�: ");
		int n = sc.nextInt();
		
		
		switch(n) {
		case 1:
			System.out.println("���� ���߽��ϴ�.");
			break;
		case 2: case 3:
			System.out.println("���߽��ϴ�.");
			break;
		case 4: case 5: case 6:
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("����ؾ߰ڽ��ϴ�.");
		
		}
	}
}
