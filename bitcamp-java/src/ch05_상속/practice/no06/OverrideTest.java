package ch05_상속.practice.no06;

class Vehicle{
	static String color;
	static int speed;
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	static void show() {
		System.out.printf("자동차 색상은 %s이고, 자동차 속도는 %d이다.", color, speed);
	}
}

class Car extends Vehicle{
	static int displacement;
	static int gears;
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	static void show() {
		System.out.printf("자동차 색상은 %s이고, 자동차 속도는 %d, 자동차 배기량은 %d, 자동차 기어단수는 %d이다."
				, color, speed, displacement, gears);
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();

		System.out.println();
		Vehicle v = c;
		v.show();
	}
}