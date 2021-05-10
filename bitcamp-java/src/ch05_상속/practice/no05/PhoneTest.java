package ch05_���.practice.no05;

class Phone{
	protected String owner;
	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	void talk() {
		System.out.printf("%s�� ��ȭ ���̴�.\n", owner);
	}
}

class Telephone extends Phone{
	private String when;
	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}
	void autoAnswering() {
		System.out.printf("%s�� ����. %s ��ȭ �ٷ�.\n", owner, when);
	}
}

class Smartphone extends Phone{
	private String game;
	public Smartphone(String owner, String game) {
		super(owner);
		this.game = game;
	}

	void playGame() {
		System.out.printf("%s�� %s ������ �ϴ� ���̴�.\n", owner, game);
	}
}

public class PhoneTest {
	public static void main(String[] args) {

		Phone[] phones = { new Phone("Ȳ����"), new Telephone("�浿��", "����"),
							new Smartphone("�α���", "������") };
		
//		phones[0].talk();
//		((Telephone)phones[1]).autoAnswering();
//		((Smartphone)phones[2]).playGame();
		
		for(Phone phone: phones) {
			if (phone instanceof Smartphone) { ((Smartphone) phone).playGame(); } 
			else if (phone instanceof Telephone) { ((Telephone) phone).autoAnswering(); } 
			else if (phone instanceof Phone) { phone.talk(); }

		}
	}
}


