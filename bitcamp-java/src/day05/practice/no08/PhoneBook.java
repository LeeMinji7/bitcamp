package day05.practice.no08;

import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	
	public Phone(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
public class PhoneBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο���>> ");
		int num = sc.nextInt();
		boolean state = true;
		
		Phone phone[] = new Phone[num];
		for(int i=0; i<num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� ��ĭ���� �Է�)>>> ");
			String names = sc.next();
			String tels = sc.next();
			phone[i] = new Phone(names, tels);
		}
		System.out.println("����Ǿ����ϴ�.");
		
		while(state) {
			System.out.print("�˻��� �̸�>> ");
			String searchName = sc.next();
			
			for(int i=0; i<num+1; i++) {
				if(i == (num)) {
					System.out.println(searchName + " �� �����ϴ�.");
					break;
				}
				if(searchName.equals(phone[i].getName())) {
					System.out.println(phone[i].getName() + "�� ��ȣ�� " + phone[i].getTel() + " �Դϴ�.");
					break;
				}
				else if(searchName.equals("�׸�")) {
					state = false;
					break;
				}
			}
		}
	}
}
