package ch04_Ŭ�����Ͱ�ü.�ڹ�������;

public class DeckTest2 {

	public static void main(String[] args) {

		Deck2 d = new Deck2(); // ī�� �ѹ�(Deck)�� �����.
		for(int i=0; i<52; i++) {
			System.out.println(d.cardArr[i]);
		}
		
	}
}
class Deck2{
	final int CARD_NUM = 52; // ī���� ����
	Card2 cardArr[] = new Card2[CARD_NUM]; // Card��ü �迭�� ����
	String[] kinds = {"CLOVER", "HEART", "DIAMOND", "SPADE"};
	Deck2() {
		int i=0;
		for(int k=0; k<Card2.KIND_MAX; k++)
			for(int n=0; n<Card2.NUM_MAX; n++)
				cardArr[i++] = new Card2(kinds[k], n+1);
	}
}
class Card2{
	String numbers = "0123456789XJQK"; // ���� 10�� X�� ǥ��
	static final int KIND_MAX = 4; // ī�� ������ ��
	static final int NUM_MAX = 13; // ���̺� ī�� ��
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
	} // toString()�� ��
}// CardŬ������ ��
