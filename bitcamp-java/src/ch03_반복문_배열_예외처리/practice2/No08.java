package ch03_�ݺ���_�迭_����ó��.practice2;

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
