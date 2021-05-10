package ch05_상속;
public class UsingOverride {

	public static void main(String[] args) {

		Shape start, last, obj;
		// linkedlist로 도형 생성하여 연결
		start = new Line();
		last = start;
		
		obj = new Rect();
		last.next = obj;
		last = obj;
		
		obj = new Line();
		last.next = obj;
		last = obj;
		
		obj = new Circle();
		last.next = obj;
		// 모든 도형 출력
		Shape p = start;
		while(p!= null) {
			p.draw();
			p = p.next;
		}		
	}
}
