package ch06_lang��Ű��;
import java.util.Arrays;
import java.util.StringJoiner;

class StringEx4 {
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr   = animals.split(",");

		System.out.println(String.join("-", arr));
		System.out.println(Arrays.toString(arr));

		StringJoiner sj = new StringJoiner("/","[","]"); //StringJoiner(������, ���λ�, ���̻�)
														// join�� �� ���̴� ���ڸ� ����� ��ü
		for(String s : arr)
			sj.add(s);

		System.out.println(sj.toString());
	}
}
