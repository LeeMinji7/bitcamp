package ch05_���;
class DrawShape {
	public static void main(String[] args) {
		Point3[] p = {   new Point3(100, 100),
                        new Point3(140,  50),
                        new Point3(200, 100)
					};

		Triangle t = new Triangle(p);
		Circle4   c = new Circle4(new Point3(150, 150), 50);

		t.draw(); // �ﰢ���� �׸���.
		c.draw(); // ���� �׸���.
	}
}

class Shape3 {
	String color = "black";
	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class Point3 {
	int x;
	int y;
	Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	Point3() {
		this(0,0);
	}
	String getXY() {  
		return "("+x+","+y+")"; // x�� y�� ���� ���ڿ��� ��ȯ
	}
}

class Circle4 extends Shape3 {
	Point3 center;	// ���� ������ǥ
	int r;			// ������
	Circle4() {		
		this(new Point3(0, 0), 100); // Circle(Point center, int r)�� ȣ��
	}
	Circle4(Point3 center, int r) {
		this.center = center;
		this.r = r;
	}
	void draw() { // ���� �׸��� ��ſ� ���� ������ ����ϵ��� �ߴ�.
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape3 {
	Point3[] p = new Point3[3];
	Triangle(Point3[] p) {
		this.p = p;
	}
	void draw() { 
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}
