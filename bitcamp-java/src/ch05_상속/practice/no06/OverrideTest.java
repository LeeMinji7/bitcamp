package ch05_���.practice.no06;

class Vehicle{
	static String color;
	static int speed;
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	static void show() {
		System.out.printf("�ڵ��� ������ %s�̰�, �ڵ��� �ӵ��� %d�̴�.", color, speed);
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
		System.out.printf("�ڵ��� ������ %s�̰�, �ڵ��� �ӵ��� %d, �ڵ��� ��ⷮ�� %d, �ڵ��� ���ܼ��� %d�̴�."
				, color, speed, displacement, gears);
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		Car c = new Car("�Ķ�", 200, 1000, 5);
		c.show();

		System.out.println();
		Vehicle v = c;
		v.show();
	}
}