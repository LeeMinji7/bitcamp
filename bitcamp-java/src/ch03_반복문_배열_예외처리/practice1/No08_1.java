package ch03_반복문_배열_예외처리.practice1;

import java.util.Scanner;

public class No08_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 몇개? ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int i, j, count;
		
		for(i=0; i<n; i++) {
			arr[i] = (int)(Math.random()*100 + 1);
			count = 0;
			for(j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					count++;
					break;
				}
			}
			
			if(count == 1) {
				i--;
				continue;
			}
			
			if((i%10) == 0 && i!= 0)
				System.out.println();
			System.out.print(arr[i] + " ");
			System.out.print('\t');
		}
	}
}
