package ch04_클래스와객체.practice3;

import java.util.Arrays;
import java.util.Scanner;

public class No05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 10개 입력하세요. ");
		int num;
		int[] hist = new int[10];
		
		for(int i=0; i<10; i++) {
			num = sc.nextInt();
			if(num >=0)
				hist[num/10]++;	
		}
		
		for(int i=0; i<10; i++) {
			System.out.print((10*i) + " ~ " + (10*i+9) + " : ");
			for(int j=0; j<hist[i];j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
