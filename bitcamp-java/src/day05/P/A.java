package day05.P;

import day05.Q.B;
import day05.Q.C;

class A {

	void f() {
		B b = new B();
//		C c = new C(); // ����:���� ������ ����
	}
	
	public static void main(String[] args) {
		B b = new B();
		C c = b.makeCObj(20, "ȫ�浿");
		System.out.println(c.getAge());
	}
}
