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
		
		System.out.print("인원수>> ");
		int num = sc.nextInt();
		boolean state = true;
		
		Phone phone[] = new Phone[num];
		for(int i=0; i<num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력)>>> ");
			String names = sc.next();
			String tels = sc.next();
			phone[i] = new Phone(names, tels);
		}
		System.out.println("저장되었습니다.");
		
		while(state) {
			System.out.print("검색할 이름>> ");
			String searchName = sc.next();
			
			for(int i=0; i<num+1; i++) {
				if(i == (num)) {
					System.out.println(searchName + " 이 없습니다.");
					break;
				}
				if(searchName.equals(phone[i].getName())) {
					System.out.println(phone[i].getName() + "의 번호는 " + phone[i].getTel() + " 입니다.");
					break;
				}
				else if(searchName.equals("그만")) {
					state = false;
					break;
				}
			}
		}
	}
}
