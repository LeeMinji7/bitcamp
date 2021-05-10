package ch04_클래스와객체.Q;

public class B {

	public C makeCObj(int age, String name) {
		C c = new C();
		c.setAge(age);
		c.setName(name);
		return c;
	}
}
