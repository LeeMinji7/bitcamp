package ch04_클래스와객체;

public class Animal {

	String name;
	int age;
	
	void eat() {
		System.out.println("eating");
	}
	
	void speak() {
		System.out.println("speaking");
	}
	
	void love() {
		System.out.println("loving");
	}
	
	public static void main(String[] args) {

		Plant p1 = new Plant();
		p1.drink();
		
		Animal lion = new Animal();
		lion.name = "lion";
		lion.age = 4;
		
		Animal bear = new Animal();
		bear.name = "bear";
		bear.age = 8;
		
	}

}

class Plant{
	String name;
	int height;
	double weight;
	void drink() {
		Animal a1 = new Animal();
		a1.eat();
	}
}
