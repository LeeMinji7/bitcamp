package day05.practice.no10;

import java.util.Scanner;

class Dictonary{
	private static String[] kor = {"사람", "아기", "돈", "미래", "희망"};
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
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어? ");
			String words = sc.next();
			
			if(words.equals("그만")) break;
			if(dic.kor2Eng(words) == null)
				System.out.println(words + "은 저의 사전에 없습니다.");
			else
				System.out.println(words + "은 " + dic.kor2Eng(words));
			
		}
	}

}
