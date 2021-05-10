package ch03_반복문_배열_예외처리.practice1;

public class No01_DoWhileTest {

	public static void main(String[] args) {
		int sum=0, i=0;
		do {
			sum += i;
			i += 2;
		}
		while(i<100);
		System.out.println(sum);
	}
}
