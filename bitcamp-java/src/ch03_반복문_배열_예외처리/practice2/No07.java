package ch03_�ݺ���_�迭_����ó��.practice2;

import java.util.Scanner;

public class No07 {

	public static void main(String[] args) {

		
		String c = input("ö��");
		String y = input("����");
		
		whoWin(c, y);
		
	}

	static String input(String s) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(s + ": ");
		s = sc.next();
		return s;
	}
	
	static void whoWin(String c, String y) {
		if(c.equals("s")) {
			if(y.equals("s"))
				System.out.println("���º�");
			else if(y.equals("r"))
				System.out.println("����, ��!");
			else
				System.out.println("ö��, ��!");
		}
		else if(c.equals("r")) {
			if(y.equals("s"))
				System.out.println("ö��, ��!");
			else if(y.equals("r"))
				System.out.println("���º�");
			else
				System.out.println("����, ��!");
		}
		else {
			if(y.equals("s"))
				System.out.println("����, ��!");
			else if(y.equals("r"))
				System.out.println("ö��, ��!");
			else
				System.out.println("���º�");
		}
	}

}
