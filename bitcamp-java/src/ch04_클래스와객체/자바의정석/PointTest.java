package ch04_클래스와객체.자바의정석;

public class PointTest {

	public static void main(String[] args) {

		Point3D p3 = new Point3D(1,2,3);
		System.out.println(p3.getLocations());
	}
}

class Point2{
	int x;
	int y;
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x: "+ x + ", y : " + y;	
	}
}

class Point3D extends Point2{
	int z;
	Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	String getLocations() {
		return "x: "+ x + ", y : " + y + ", z: " + z;	
	}
}
