package ch04_Ŭ�����Ͱ�ü.�ڹ�������;

public class StaticTest {

	static int width = 200;
	static int height = 120;
	static int x,y; // �ʱ�ȭ ���� ������ 0���� �ʱ�ȭ��
	static {
		
	}
	public StaticTest() {
		x = 100;
		y = 200;
	}
	static int max(int x, int y) {
		return x > y? x: y;
	}
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		System.out.println(st.x + ", " +st.y);
	}

}
