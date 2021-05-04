package day03.practice;

import java.util.Scanner;

public class No8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 몇개? ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int count = 0;
		int i=0, j=0;
		
		for(i=0; i<n; i++) {
			arr[i] = (int)(Math.random()*100 + 1);
			
			do {
				count = 0;
				for(j=0; j<arr.length; j++) {
					if(arr[i] == arr[j]) {
						count++;
					}
				if(count > 2)
					arr[i] = (int)(Math.random()*100 + 1);
				}
			}
			while(count > 2);
		}
		
	}
}
