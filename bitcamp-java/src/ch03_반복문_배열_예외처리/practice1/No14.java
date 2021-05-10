package ch03_반복문_배열_예외처리.practice1;

import java.util.Scanner;

public class No14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		String name;
		int i;
		
		while(true) {
			
			System.out.print("과목 이름>> ");
			name = sc.next();
			
			if(name.equals("그만"))
				break;
			
			for(i=0; i<course.length; i++) {
				if(course[i].equals(name)) {
					System.out.println(name + "의 점수는 " + score[i]);
					break;
				}				
			}
			if(i == course.length)
				System.out.println("없는 과목입니다.");
		}
	}
}
