package ch04_클래스와객체.practice3;

import java.util.Arrays;
import java.util.Scanner;

public class No04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("URL을 입력하세요: ");
		String url = sc.nextLine();
		
		if(url.endsWith("com"))
			System.out.println(url + "은 \'com\'으로 끝납니다.");
		
		// "java" 포함 확인 방법 1
		if(url.contains("java"))
			System.out.println(url + "은 \'java\'를 포함합니다.");

		/*//"java" 포함 확인 방법2		
		String[] urls = url.split("\\.");
		for(int i=0; i<urls.length; i++) {
			if(urls[i].equals("java"))
				System.out.println(url + "은 \'java\'를 포함합니다.");
		} 
		*/
	}

}
