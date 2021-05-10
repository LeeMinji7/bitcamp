package ch03_반복문_배열_예외처리.practice1;

public class No09 {

	public static void main(String[] args) {

		int arr[][] = new int[4][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*10 + 1);
				System.out.print(arr[i][j]);
				System.out.print('\t');
			}
			System.out.println();
		}
	}
}
