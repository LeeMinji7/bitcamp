package ch03_반복문_배열_예외처리.자바의정석.예외처리;
class ExceptionEx12 {
	public static void main(String[] args) throws Exception {
		method1();	 // 같은 클래스내의 static멤버이므로 객체생성없이 직접 호출가능.
  	}	// main메서드의 끝

	static void method1() throws Exception {
		method2();
	}	// method1의 끝

	static void method2() throws Exception {
		throw new Exception();
	}	// method2의 끝
}
