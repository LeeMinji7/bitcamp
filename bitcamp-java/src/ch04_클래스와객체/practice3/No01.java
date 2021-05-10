package ch04_클래스와객체.practice3;

public class No01 {

	static int countChar(String s, char c) {
		int cnt = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == c) cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {

		System.out.println(countChar("minji", 'i'));
	}

}
