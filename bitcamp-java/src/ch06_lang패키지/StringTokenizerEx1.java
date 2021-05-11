package ch06_lang패키지;
import java.util.*; 

class StringTokenizerEx1 { 
	public static void main(String[] args){ 
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source, ",");

		while(st.hasMoreTokens()){ // 토큰이 있는지 검증
			System.out.println(st.nextToken()); // 존재하는 토큰 출력
		}
	} // main의 끝
} 
