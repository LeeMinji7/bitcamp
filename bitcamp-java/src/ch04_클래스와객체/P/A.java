package ch04_클래스와객체.P;

import ch04_클래스와객체.Q.B;
import ch04_클래스와객체.Q.C;

class A {

	void f() {
		B b = new B();
//		C c = new C(); // 오류:접근 지정자 오류
	}
	
	public static void main(String[] args) {
		B b = new B();
		C c = b.makeCObj(20, "홍길동");
		System.out.println(c.getAge());
	}
}
