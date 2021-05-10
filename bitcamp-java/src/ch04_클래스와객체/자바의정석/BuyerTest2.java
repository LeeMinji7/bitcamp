package ch04_클래스와객체.자바의정석;

import java.util.Vector;

class Product2{
	int price;
	int bonusPoint;
	Product2(int price, int bonus){
		this.price = price;
		this.bonusPoint = bonus;
	}
}

class Tv3 extends Product2{
	String name = "TV";
	Tv3(int price, int bonus){
		super(price, bonus);
//		System.out.println(name);
	}
	public String toString() { return "Tv";}
}
class Computer2 extends Product2{
	String name = "Computer";
	Computer2(int price, int bonus){
		super(price, bonus);
//		System.out.println(name);
		}
	public String toString() { return "Computer";}
}
class Audio2 extends Product2{
	String name = "Audio";
	Audio2(int price, int bonus){
		super(price, bonus);
//		System.out.println(name);
		}
	public String toString() { return "Audio";}
}
class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	Vector cart = new Vector();
	void buy(Vector pcart) {
		for(int i=0; i<pcart.size(); i++) {
			if(money < ((Product2)pcart.get(i)).price) { // vector가 object 타입이므로 product타입으로 casting
				System.out.println("잔액부족~~");
				return;
			}
			money -= ((Product2)pcart.get(i)).price; 
			bonusPoint += ((Product2)pcart.get(i)).bonusPoint;		
		}
	}
	void summary() {
		int sum = 0;
		String cartList = "";
		if(cart.isEmpty()) {
			System.out.println("구입물품이 없습니다.");
			return;
		}
		String pname = "";
		for(int i=0; i<cart.size(); i++) {
			Product2 p = (Product2)cart.get(i);
			sum += p.price;
//			if(p instanceof Tv3) {
//				pname = ((Tv3)p).name;
//			}
//			else if(p instanceof Computer2) {
//				pname = ((Computer2)p).name;
//			}
//			else if(p instanceof Audio2) {
//				pname = ((Audio2)p).name;
//			}
//			cartList += (i==0)? ""+pname: ","+pname;
			cartList += (i==0)? ""+p: ","+p;
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + cartList + "입니다.");
	}
	void showBuyer() {
		System.out.println("잔액: " + money + ", 포인트: " + bonusPoint);
	}
}
public class BuyerTest2 {

	public static void main(String[] args) {
		
		Buyer2 b2 = new Buyer2();
		b2.showBuyer();
		
		b2.cart.add(new Tv3(200, 10));
		b2.cart.add(new Computer2(300, 15));
		b2.cart.add(new Audio2(100, 5));
		b2.summary();
		b2.buy(b2.cart);
		b2.showBuyer();
	}
}
