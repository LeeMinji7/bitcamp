package ch04_Ŭ�����Ͱ�ü.practice1.no01;

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
		System.out.println(brand + "���� ���� " + year + "���� " + size + "��ġ TV");
	}
	public static void main(String[] args) {

		TV myTV = new TV("LG", 2017, 32);
		myTV.show();	
	}
}
