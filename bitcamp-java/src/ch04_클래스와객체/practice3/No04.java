package ch04_Ŭ�����Ͱ�ü.practice3;

import java.util.Arrays;
import java.util.Scanner;

public class No04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("URL�� �Է��ϼ���: ");
			String url = sc.nextLine();
			
			if(url.equals("bye")) break; 
			if(url.endsWith("com"))
				System.out.println(url + "�� \'com\'���� �����ϴ�.");
			
			// "java" ���� Ȯ�� ��� 1
			if(url.contains("java"))
				System.out.println(url + "�� \'java\'�� �����մϴ�.");
	
			/*//"java" ���� Ȯ�� ���2		
			String[] urls = url.split("\\.");
			for(int i=0; i<urls.length; i++) {
				if(urls[i].equals("java"))
					System.out.println(url + "�� \'java\'�� �����մϴ�.");
			} 
			*/
		}
	}

}
