package day06;
class Point{
	private int x,y; // ÇÑ Á¡À» ±¸¼ºÇÏ´Â x, y ÁÂÇ¥
	public void set(int x, int y) {
		this.x = x; this.y= y;
	}
	public void showPoint() { // Á¡ÀÇ ÁÂÇ¥ Ãâ·Â
		System.out.println("("+x+"," + y + ")");
	}
}

class ColorPoint extends Point{ // Point¸¦ »ó¼Ó¹Þ´Â colorPoint ¼±¾ð
	private String color; // Á¡ÀÇ »ö
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { // ÄÃ·¯Á¡ÀÇ ÁÂÇ¥ Ãâ·Â
		System.out.print(color);
		showPoint(); // Point Å¬·¡½ºÀÇ showPoint() È£Ãâ
	}
}
public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point(); // Point °´Ã¼ »ý¼º
		p.set(1, 2); // Point Å¬·¡½ºÀÇ set() È£Ãâ
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(); // colorPoint °´Ã¼ »ý¼º
		cp.set(1, 2); // Point Å¬·¡½ºÀÇ set() È£Ãâ
		cp.setColor("red"); // colorPoint Å¬·¡½ºÀÇ setColor() È£Ãâ
		cp.showColorPoint(); // ÄÃ·¯ÀÇ ÁÂÇ¥ ­‹·Â
	}
}