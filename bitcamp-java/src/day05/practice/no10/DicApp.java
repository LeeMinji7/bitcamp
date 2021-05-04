package day05.practice.no10;

import java.util.Scanner;

class Dictonary{
	private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String[] eng = {"love", "baby", "money","future","hope"};
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		return null;
	}
}
public class DicApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Dictonary dic = new Dictonary();
		
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�? ");
			String words = sc.next();
			
			if(words.equals("�׸�")) break;
			if(dic.kor2Eng(words) == null)
				System.out.println(words + "�� ���� ������ �����ϴ�.");
			else
				System.out.println(words + "�� " + dic.kor2Eng(words));
			
		}
	}

}
