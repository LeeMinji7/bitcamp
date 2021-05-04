package day05.P;

import day05.Q.B;
import day05.Q.C;

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
