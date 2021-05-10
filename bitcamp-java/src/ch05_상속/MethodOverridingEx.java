package ch05_���;
class Shape{ // ���� Ŭ����
	public Shape next; // �׸� 5-22�� �ڵ带 ���� �ʿ��� �κ�
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line"); // �޼ҵ� �������̵�
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect"); // �޼ҵ� �������̵�
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle"); // �޼ҵ� �������̵�
	}
}
public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw(); // p�� ����Ű�� ��ü ���� �������̵� �� draw() ȣ�� // ���� ���ε�
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
