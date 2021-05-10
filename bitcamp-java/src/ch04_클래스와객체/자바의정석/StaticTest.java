package ch04_클래스와객체.자바의정석;

public class StaticTest {

	static int width = 200;
	static int height = 120;
	static int x,y; // 초기화 하지 않으면 0으로 초기화됨
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
