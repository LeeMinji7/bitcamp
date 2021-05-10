package ch04_클래스와객체.practice1.no01;

public class TV {

	int size;
	int year;
	String brand;
	
	TV(String brand, int year, int size){
		this.brand = brand;
		this.year = year;
		this.size = size;
	}
	
	void show() {
		System.out.println(brand + "에서 만든 " + year + "년형 " + size + "인치 TV");
	}
	public static void main(String[] args) {

		TV myTV = new TV("LG", 2017, 32);
		myTV.show();	
	}
}
