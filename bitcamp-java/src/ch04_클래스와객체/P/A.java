package ch04_Ŭ�����Ͱ�ü.P;

import ch04_Ŭ�����Ͱ�ü.Q.B;
import ch04_Ŭ�����Ͱ�ü.Q.C;

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
