package ch04_Ŭ�����Ͱ�ü.�ڹ�������;

public class DrawShape {
	public static void main(String[] args) {
		Point[] p = { new Point(100, 100)
				, new Point(140, 50)
				, new Point(200, 100) };
		Triangle t = new Triangle(p);
		Triangle t2 = new Triangle(p[0], p[1], p[2]);
		Circle c = new Circle(new Point(150, 150), 50);
		t.draw(); // �ﰢ���� �׸���.
		t2.draw();
		c.draw(); // ���� �׸���.
		}
}

class Shape{
	String color = "black";
	void draw() {
		//������ �׸���
		System.out.printf("[color=%s]%n", color);
	}
}

class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	Point(){ this(0,0);}
	String getXY() {
		return "("+x+", "+y+")"; // x�� y�� ���� ���ڿ��� ��ȯ
	}
}
class Circle extends Shape{
	Point center; // ���� ������ǥ
	int r; // ������
	Circle(){
		this(new Point(0, 0), 100); // Circle(Point center, int r)ȣ��
	}
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	void draw() { // ���� �׸��� ��ſ� ���� ������ ���
		System.out.printf("[center(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape{
	Point[] p = new Point[3];
	Triangle(Point[] p) {
		this.p = p;
	}
	Triangle(Point p1, Point p2, Point p3){
		this.p = new Point[] {p1, p2, p3};
	}
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}