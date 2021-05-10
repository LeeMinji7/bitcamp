package ch03_반복문_배열_예외처리.practice1;

public class No01_WhileTest {

	public static void main(String[] args) {
		int sum=0, i=0;
		while(i<100) {
			sum=sum+i;
			i+=2;
		}
		System.out.println(sum);
	}
}
