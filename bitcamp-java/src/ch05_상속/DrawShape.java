package ch05_상속;
class DrawShape {
	public static void main(String[] args) {
		Point3[] p = {   new Point3(100, 100),
                        new Point3(140,  50),
                        new Point3(200, 100)
					};

		Triangle t = new Triangle(p);
		Circle4   c = new Circle4(new Point3(150, 150), 50);

		t.draw(); // 삼각형을 그린다.
		c.draw(); // 원을 그린다.
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
		return "("+x+","+y+")"; // x와 y의 값을 문자열로 반환
	}
}

class Circle4 extends Shape3 {
	Point3 center;	// 원의 원점좌표
	int r;			// 반지름
	Circle4() {		
		this(new Point3(0, 0), 100); // Circle(Point center, int r)를 호출
	}
	Circle4(Point3 center, int r) {
		this.center = center;
		this.r = r;
	}
	void draw() { // 원을 그리는 대신에 원의 정보를 출력하도록 했다.
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
