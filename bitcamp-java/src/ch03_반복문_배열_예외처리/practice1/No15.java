package ch03_�ݺ���_�迭_����ó��.practice1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class No15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>> ");
				int n = sc.nextInt();
				int m = sc.nextInt();
				
				System.out.println(n + "x" + m + "=" + n*m);
				break;
			}catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				sc.nextLine();
			}
		}
	}
}
