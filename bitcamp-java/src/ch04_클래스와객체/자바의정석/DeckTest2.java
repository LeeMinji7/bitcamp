package ch04_클래스와객체.자바의정석;

public class DeckTest2 {

	public static void main(String[] args) {

		Deck2 d = new Deck2(); // 카드 한벌(Deck)을 만든다.
		for(int i=0; i<52; i++) {
			System.out.println(d.cardArr[i]);
		}
		
	}
}
class Deck2{
	final int CARD_NUM = 52; // 카드의 개수
	Card2 cardArr[] = new Card2[CARD_NUM]; // Card객체 배열을 포함
	String[] kinds = {"CLOVER", "HEART", "DIAMOND", "SPADE"};
	Deck2() {
		int i=0;
		for(int k=0; k<Card2.KIND_MAX; k++)
			for(int n=0; n<Card2.NUM_MAX; n++)
				cardArr[i++] = new Card2(kinds[k], n+1);
	}
}
class Card2{
	String numbers = "0123456789XJQK"; // 숫자 10은 X로 표현
	static final int KIND_MAX = 4; // 카드 무늬의 수
	static final int NUM_MAX = 13; // 무늬별 카드 수
	final String KIND;
	final int NUMBER;
	static int width = 100;
	static int height = 250;
	Card2(){ this("HEART", 1);}
	Card2(String kind, int number){
		KIND = kind;
		NUMBER = number;
	}
	public String toString() {
		return "" + KIND + " " +NUMBER;
	} // toString()의 끝
}// Card클래스의 끝
