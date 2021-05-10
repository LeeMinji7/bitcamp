package ch02_기본프로그래밍.programming;

public class No5 {

	public static void main(String[] args) {
		
		char c = (char)((int)(Math.random()*26)+97);
		int n = (int)'A' - (int)'a';
		
		System.out.printf("%c\n", c+n);
	}
}
