package day06;
class Point2{
	private int x,y; // ÇÑ Á¡À» ±¸¼ºÇÏ´Â x, y ÁÂÇ¥
	public Point2() {
		this.x = this.y = 0;
	}
	public Point2(int x, int y) {
		this.x=x; this.y = y;
	}
	public void showPoint() { // Á¡ÀÇ ÁÂÇ¥ Ãâ·Â
		System.out.println("("+x+"," + y + ")");
	}
}

class ColorPoint2 extends Point2{ // Point¸¦ »ó¼Ó¹Þ´Â colorPoint ¼±¾ð
	private String color; // Á¡ÀÇ »ö
	public ColorPoint2(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void showColorPoint() { // ÄÃ·¯Á¡ÀÇ ÁÂÇ¥ Ãâ·Â
		System.out.print(color);
		showPoint(); // Point Å¬·¡½ºÀÇ showPoint() È£Ãâ
	}
}
public class SuperEx {
	public static void main(String[] args) {
		ColorPoint2 cp = new ColorPoint2(5, 6, "blue"); 
		cp.showColorPoint(); // ÄÃ·¯ÀÇ ÁÂÇ¥ ­‹·Â
	}
}