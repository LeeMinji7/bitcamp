package ch03_�ݺ���_�迭_����ó��.practice2;

import java.util.Scanner;

public class No06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ö��: ");
		String manSelect = sc.next();
		
		System.out.print("����: ");
		String womanSelect = sc.next();
		
		if(manSelect.equals("s")) {
			if(womanSelect.equals("s"))
				System.out.println("���º�");
			else if(womanSelect.equals("r"))
				System.out.println("����, ��!");
			else
				System.out.println("ö��, ��!");
		}
		else if(manSelect.equals("r")) {
			if(womanSelect.equals("s"))
				System.out.println("ö��, ��!");
			else if(womanSelect.equals("r"))
				System.out.println("���º�");
			else
				System.out.println("����, ��!");
		}
		else {
			if(womanSelect.equals("s"))
				System.out.println("����, ��!");
			else if(womanSelect.equals("r"))
				System.out.println("ö��, ��!");
			else
				System.out.println("���º�");
		}
	}
}
