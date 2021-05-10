package ch04_클래스와객체;

public class ReferencePassing {

	public static void main(String[] args) {
		
		Circle4 pizza = new Circle4(10);
		increase(pizza);
		System.out.println(pizza.radius);
	}
	
	static void increase(Circle4 m) {
		m.radius++;
	}
}
class Circle4{
	int radius;
	Circle4(int radius){
		this.radius = radius;
	}
}
