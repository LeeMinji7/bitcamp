package ch03_�ݺ���_�迭_����ó��.practice1;

import java.util.Scanner;

public class No06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>> ");
		int money = sc.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			int count = money / unit[i];
			money -= unit[i] * count;
			
			if(count != 0)
				System.out.println(unit[i] + "�� ¥�� : " + count + "��" );
		}
	}
}
