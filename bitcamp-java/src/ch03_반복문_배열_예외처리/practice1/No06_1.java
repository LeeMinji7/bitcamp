package ch03_반복문_배열_예외처리.practice1;

import java.util.Scanner;

public class No06_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int count[] = new int[8];
		
		System.out.print("금액을 입력하시오>> ");
		int money = sc.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			while(money >= unit[i]){
				money -= unit[i];
				count[i]++;
			}
			if(count[i] != 0)
				System.out.println(unit[i] + "원 짜리 : " + count[i] + "개" );
		}
	}
}
