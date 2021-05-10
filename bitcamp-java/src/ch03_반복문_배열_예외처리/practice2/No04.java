package ch03_반복문_배열_예외처리.practice2;

public class No04 {

	public static void main(String[] args) {

		for(int i=1; i<6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
