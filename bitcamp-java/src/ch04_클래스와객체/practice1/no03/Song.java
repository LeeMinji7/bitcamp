package ch04_Ŭ�����Ͱ�ü.practice1.no03;

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
		System.out.println(year + "�� " + country + "������ " + artist +"�� �θ� "+ title );
	}

	public static void main(String[] args) {
		
		Song s = new Song("Dancing Queen", "ABBA", "������", 1978);
		s.show();

	}

}
