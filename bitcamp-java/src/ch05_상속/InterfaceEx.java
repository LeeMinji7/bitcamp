package ch05_���;
interface PhoneInterface{ // �������̽� ����
	final int TIMEOUT = 10000; // ��� �ʵ� ����
	void sendCall(); // �߻� �޼ҵ�
	void receiveCall(); // �߻� �޼ҵ�
	default void printLogo() { // default �޼ҵ�
		System.out.println("**phone**");
	}
}

interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{ // �������̽� ����
	public void play();
	public void stop();
}
class PDA{
	public int calculate(int x, int y) {
		return x+y;
	}
}

// SmartPhone Ŭ������ PDA ��ӹް�,
// MobilePhoneInterface�� MP3Interface �������̽��� ����� �߻� �޼ҵ带 ��� ����
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	// MobilePhoneInterface�� �߻� �޼ҵ� ����
	
	@Override
	public void sendCall() {
		System.out.println("������������~~");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��.");
	}

	@Override
	public void play() {
		System.out.println("���� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("���� �ߴ��մϴ�.");
	}

	@Override
	public void sendSMS() {
		System.out.println("���ڰ��ϴ�.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("���� �Ծ��.");
	}
	
	public void schedule() {
		System.out.println("���� �����մϴ�.");
	}
	
}
class SamsungPhone implements PhoneInterface{ // �������̽� ����
	//PhoneInterface�� ��� �߻� �޼ҵ� ����
		
	@Override
	public void sendCall() {
		System.out.println("�츮������");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	} 
	
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
}
public class InterfaceEx {

	public static void main(String[] args) {

		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		System.out.println();
		
		SmartPhone phone2 = new SmartPhone();
		phone2.printLogo();
		phone2.sendCall();
		phone2.play();
		System.out.println("3�� 5�� ���ϸ� " + phone2.calculate(3, 5));
		phone2.schedule();
	}

}
