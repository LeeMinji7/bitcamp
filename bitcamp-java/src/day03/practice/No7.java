package day03.practice;

public class No7 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		int sum = 0;
		double avg = 0.0;
		
		System.out.print("·£´ýÇÑ Á¤¼öµé :");
		
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			sum += arr[i];
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		
		avg = sum/10.0;
		System.out.println("Æò±ÕÀº " + avg);
	}
}
