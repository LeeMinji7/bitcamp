package ch04_클래스와객체;

public class Book {
	
	String title;
	String author;
	
	public Book(String t) { // 생성자
		title = t;
		author = "작자미상";
	}
	
	public Book(String t, String a) { // 생성자
		title = t;
		author = a;
	}

	public static void main(String[] args) {

		Book littlePrice = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		
		System.out.println(littlePrice.title + " " + littlePrice.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}

}
