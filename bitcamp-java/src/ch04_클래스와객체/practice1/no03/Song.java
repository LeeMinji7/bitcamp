package ch04_클래스와객체.practice1.no03;

public class Song {
	String title, artist, country;
	int year;
	
	public Song() {
		this(null, null, null, 0);
	}

	public Song(String title, String artist, String country, int year) {
		super();
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}
	public void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist +"가 부른 "+ title );
	}

	public static void main(String[] args) {
		
		Song s = new Song("Dancing Queen", "ABBA", "스웨덴", 1978);
		s.show();

	}

}
