package ch03_�ݺ���_�迭_����ó��.practice2;

import java.util.Scanner;

public class No03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, sum=0;
		
		do {
			System.out.print("���� ������ �Է��ϼ���: ");
			n = sc.nextInt();
			if(n%2 == 0)
				sum += n;
		}while(n>0);
		
		System.out.println("�Է��� ���� ���� �߿��� ¦���� ���� " + sum);
	}
}
