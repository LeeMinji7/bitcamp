package ch06_lang패키지;
import java.util.regex.*;	// Pattern과 Matcher가 속한 패키지

class RegularEx1 {
	public static void main(String[] args) 
	{
		String[] data = {"bat", "baby", "bonus",
				    "cA","ca", "co", "c.", "c0", "car","combat","count",
				    "date", "disc"};		
		Pattern p = Pattern.compile("c[a-z]*");	// c로 시작하는 소문자영단어
												// compile(String regex): 주어진 정규표현식으로 부터 패턴 만듦

		for(int i=0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]); // 객체.matcher(CharSequence input): 입력 CharSequence에서 패턴으로 찾는 Match 객체 만듦
			if(m.matches()) // matches(): 해당 문자열과 패턴이 일치할 경우 true 반환
				System.out.print(data[i] + ",");
		}
	}
}
