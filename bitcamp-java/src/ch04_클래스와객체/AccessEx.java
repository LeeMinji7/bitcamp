package ch04_Ŭ�����Ͱ�ü;
class Sample{
		public int a;
		private int b;
		int c;
}

public class AccessEx {

	public static void main(String[] args) {

		Sample sample = new Sample();
		sample.a = 10;
//		sample.b= 10; // ���� : private ���
		sample.c = 10;
		}
}
