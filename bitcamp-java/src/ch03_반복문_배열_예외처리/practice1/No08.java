package ch03_�ݺ���_�迭_����ó��.practice1;

import java.util.Scanner;

public class No08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �? ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int i, j, count, cnt=0;
		
		for(i=0; i<n; i++) {
			arr[i] = (int)(Math.random()*100 + 1);
			
			do {
				count = 0;
				for(j=0; j<=i; j++) {
					if(arr[i] == arr[j]) {
						count++;
					}
				if(count > 1)
					arr[i] = (int)(Math.random()*100 + 1);
				}
			}
			while(count > 1);
			
			System.out.print(arr[i] + " ");
			cnt++;
			if(cnt % 10 == 0) {
				System.out.println();
				cnt=0;
			}	
		}
	}
}
