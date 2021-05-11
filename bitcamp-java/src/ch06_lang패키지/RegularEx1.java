package ch06_lang��Ű��;
import java.util.regex.*;	// Pattern�� Matcher�� ���� ��Ű��

class RegularEx1 {
	public static void main(String[] args) 
	{
		String[] data = {"bat", "baby", "bonus",
				    "cA","ca", "co", "c.", "c0", "car","combat","count",
				    "date", "disc"};		
		Pattern p = Pattern.compile("c[a-z]*");	// c�� �����ϴ� �ҹ��ڿ��ܾ�
												// compile(String regex): �־��� ����ǥ�������� ���� ���� ����

		for(int i=0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]); // ��ü.matcher(CharSequence input): �Է� CharSequence���� �������� ã�� Match ��ü ����
			if(m.matches()) // matches(): �ش� ���ڿ��� ������ ��ġ�� ��� true ��ȯ
				System.out.print(data[i] + ",");
		}
	}
}
