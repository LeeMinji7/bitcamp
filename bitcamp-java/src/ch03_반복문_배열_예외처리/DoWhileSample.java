package ch03_�ݺ���_�迭_����ó��;

public class DoWhileSample {

	public static void main(String[] args) {
		char c = 'a';
		
		do {
			System.out.print(c);
			c = (char)(c+1); // ���ڴ� ���ϸ� ���� ���� ���ĺ��� ����
		}
		while(c <= 'z');
	}
}