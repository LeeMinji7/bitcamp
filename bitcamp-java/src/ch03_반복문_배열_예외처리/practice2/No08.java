package ch03_반복문_배열_예외처리.practice2;

public class No08 {

	static void printStar(int i) {
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
	}
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			printStar(i);
			System.out.println();
		}
	}
}
