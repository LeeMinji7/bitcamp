package ch06_lang패키지;
import java.util.Arrays;
import java.util.StringJoiner;

class StringEx4 {
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr   = animals.split(",");

		System.out.println(String.join("-", arr));
		System.out.println(Arrays.toString(arr));

		StringJoiner sj = new StringJoiner("/","[","]"); //StringJoiner(구분자, 접두사, 접미사)
														// join할 때 쓰이는 문자를 만드는 객체
		for(String s : arr)
			sj.add(s);

		System.out.println(sj.toString());
	}
}
