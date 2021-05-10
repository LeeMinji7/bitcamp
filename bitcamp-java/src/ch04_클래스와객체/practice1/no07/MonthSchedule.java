package ch04_Ŭ�����Ͱ�ü.practice1.no07;

import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
}
public class MonthSchedule {
	
	Scanner sc = new Scanner(System.in);
	
	int nDays;
	private Day days[];
	
	public MonthSchedule(int nDays) {
		this.nDays = nDays;
		this.days = new Day[nDays];
		
		for(int i=0; i<nDays; i++)
			days[i] = new Day();
	}
	
	public void input() {
		System.out.print("��¥(1~30)? ");
		int day = sc.nextInt();
		
		System.out.print("����(��ĭ���� �Է�)? ");
		String toDo = sc.next();
		
		days[day-1].set(toDo);
		
		
	};
	public void view(){
		System.out.print("��¥(1~30)? ");
		int day = sc.nextInt();
		
		System.out.print(day + "���� �� ���� ");
		days[day-1].show();
	};
	public void finish(){
		System.out.println("���α׷��� �����մϴ�.");
	};
	public int run(){
		System.out.print("����(�Է�:1, ����:2, ������:3)>> ");
		int plan = sc.nextInt();
		
		if(plan == 1) {
			input();
			return 1;
		}
		else if(plan == 2) {
			view();
			return 2;
		}
		else {
			finish();
			return 3;
		}
	};
	
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		
		System.out.println("�̹��� ������ ���� ���α׷�.");
		
		while(true) {
			int num = april.run();
			if (num == 3) break;
			System.out.println();
		}
	}
}
