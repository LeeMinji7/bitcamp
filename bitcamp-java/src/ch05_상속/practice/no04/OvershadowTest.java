package ch05_���.practice.no04;

class Parent{
	String name = "����";
	
	void print() {
		System.out.printf("���� %s�̴�." , name);
	}
}

class Child extends Parent{
	String name = "�絵����";
	
	void print() {
		System.out.printf("���� %s�̴�." , name);
	}
}
public class OvershadowTest {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.name);
		p.print();
	}

}
