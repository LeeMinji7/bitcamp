package ch05_»ó¼Ó.practice.no03;

class Point{
	private int x;
	private int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString() {
		return "("+x+", "+y+")";
	}
}

class MovablePoint extends Point{
	private int xSpeed;
	private int ySpeed;
	
	MovablePoint(int x, int y, int xSpeed, int ySpeed){
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	public String toString() {
		return "("+getX()+", "+getY()+")"+", ("+xSpeed+", "+ySpeed+")";
	}
}
public class PointTest {
	public static void main(String[] args) {
		Point p = new Point(1, 1);
		MovablePoint mp = new MovablePoint(2, 2, 2, 2);
		
		System.out.println(p);
		System.out.println(mp);
	}
}
