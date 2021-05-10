package ch04_클래스와객체;

public class Book2 {
	
	String title;
	String author;
	
	public Book2() { // 생성자
		this("", "");
	}
	
	public Book2(String title) { // 생성자
		this(title, "작자미상");
	}
	
	public Book2(String title, String author) { // 생성자
		this.title = title;
		this.author = author;
	}
	
	void show() {
		System.out.println(title + " " + author);
	}

	public static void main(String[] args) {

		Book2 littlePrice = new Book2("어린왕자", "생텍쥐페리");
		Book2 loveStory = new Book2("춘향전");
		Book2 emptyBook = new Book2();
		
		littlePrice.show();
		loveStory.show();
		emptyBook.show();
	}

}
