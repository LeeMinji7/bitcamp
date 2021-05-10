package ch03_반복문_배열_예외처리.practice1;

public class No07 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		int sum = 0;
		double avg = 0.0;
		
		System.out.print("랜덤한 정수들 :");
		
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			sum += arr[i];
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		
		avg = sum/10.0;
		System.out.println("평균은 " + avg);
	}
}
