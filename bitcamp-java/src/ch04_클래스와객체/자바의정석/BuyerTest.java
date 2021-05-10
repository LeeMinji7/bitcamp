package ch04_클래스와객체.자바의정석;

class Product{
	int price;
	int bonusPoint;
	Product(int price, int bonus){
		this.price = price;
		this.bonusPoint = bonus;
	}
}

class Tv2 extends Product{
	Tv2(int price, int bonus){
		super(price, bonus);
		String name = "TV";
		System.out.println(name);
	}
}
class Computer extends Product{
	Computer(int price, int bonus){
		super(price, bonus);
		String name = "Computer";
		System.out.println(name);
		}
}
class Audio extends Product{
	Audio(int price, int bonus){
		super(price, bonus);
		String name = "Audio";
		System.out.println(name);
		}
}
class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	Product[] cart = new Product[10];
	void buy(Product[] cart) {
		for(int i=0; i<3; i++) {
			if(money < cart[i].price) {
				System.out.println("잔액부족~~");
				return;
			}
			money -= cart[i].price;
			bonusPoint += cart[i].bonusPoint;		
		}
	}
	void showCart() {
		for(int i=0; i<cart.length; i++) {
			System.out.println(cart[i]);
		}
	}
	void showBuyer() {
		System.out.println("잔액: " + money + ", 포인트: " + bonusPoint);
	}
}
public class BuyerTest {

	public static void main(String[] args) {
		
		Buyer b1 = new Buyer();
		b1.showBuyer();
		
		b1.cart[0] = new Tv2(200, 10);
		b1.cart[1] = new Computer(300, 15);
		b1.cart[2] = new Audio(100, 5);
		
		b1.buy(b1.cart);
		b1.showCart();
		b1.showBuyer();
	}
}
