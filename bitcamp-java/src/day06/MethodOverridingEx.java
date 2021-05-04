package day06;
class Shape{ // 슈퍼 클래스
	public Shape next; // 그림 5-22의 코드를 위해 필요한 부분
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line"); // 메소드 오버라이딩
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect"); // 메소드 오버라이딩
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle"); // 메소드 오버라이딩
	}
}
public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw(); // p가 가리키는 객체 내에 오버라이딩 된 draw() 호출 // 동적 바인딩
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}
