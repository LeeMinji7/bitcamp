package day03;

public class DoWhileSample {

	public static void main(String[] args) {
		char c = 'a';
		
		do {
			System.out.print(c);
			c = (char)(c+1); // 문자는 더하면 다음 순서 알파벳이 나옴
		}
		while(c <= 'z');
	}
}