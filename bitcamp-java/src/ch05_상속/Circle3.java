package ch05_»ó¼Ó;
class Shape2{
	protected String name;
	public Shape next;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}
public class Circle3 extends Shape2{
	protected String name;
	
	@Override
	public void draw() {
		name = "Circle";
		super.name = "Shape";
		super.draw();
		System.out.println(name);
	}
	public static void main(String[] args) {
		Shape2 b = new Circle3();
		b.paint();
	}
}
