package ch03_�ݺ���_�迭_����ó��.practice1;

import java.util.Scanner;

public class No16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		do {
			System.out.print("���� ���� ��!>> ");
			String user = sc.next();
			
			int n = (int)(Math.random()*3);
			String computer = str[n];
			
			if(user.equals("�׸�"))
			break;
			
			if(user.equals("����")) {
				if(computer.equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
				else if(computer.equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
				else if(computer.equals("��"))
				System.out.println("����� = ����, ��ǻ�� = ��, ����ڰ� �̰���ϴ�.");
			}
			else if(user.equals("����")) {
				if(computer.equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
				else if(computer.equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
				else if(computer.equals("��"))
				System.out.println("����� = ����, ��ǻ�� = ��, ��ǻ�Ͱ� �̰���ϴ�.");
			}
			else if(user.equals("��")) {
				if(computer.equals("����"))
					System.out.println("����� = ��, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
				else if(computer.equals("����"))
					System.out.println("����� = ��, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
				else if(computer.equals("��"))
				System.out.println("����� = ��, ��ǻ�� = ��, �����ϴ�.");
			}
		}
		while(true);
	}
}