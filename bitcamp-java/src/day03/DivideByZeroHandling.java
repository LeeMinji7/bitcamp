package day03;

import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�������� �Է��Ͻÿ�: ");
			int dividend = sc.nextInt(); // ������ �Է�
			System.out.print("�������� �Է��Ͻÿ�: ");
			int divisor = sc.nextInt(); // ������ �Է�
			
			try {
				System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
				break; // �������� ������ �Ϸ� �� while �����
			}
			catch(Exception e) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		sc.close();
	}

}
