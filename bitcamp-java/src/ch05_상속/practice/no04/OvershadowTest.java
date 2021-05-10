package ch05_상속.practice.no04;

class Parent{
	String name = "영조";
	
	void print() {
		System.out.printf("나는 %s이다." , name);
	}
}

class Child extends Parent{
	String name = "사도세자";
	
	void print() {
		System.out.printf("나는 %s이다." , name);
	}
}
public class OvershadowTest {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.name);
		p.print();
	}

}
