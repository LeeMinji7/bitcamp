package day05.practice.no07;

import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
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
		System.out.print("날짜(1~30)? ");
		int day = sc.nextInt();
		
		System.out.print("할일(빈칸없이 입력)? ");
		String toDo = sc.next();
		
		days[day-1].set(toDo);
		
		
	};
	public void view(){
		System.out.print("날짜(1~30)? ");
		int day = sc.nextInt();
		
		System.out.print(day + "일의 할 일은 ");
		days[day-1].show();
	};
	public void finish(){
		System.out.println("프로그램을 종료합니다.");
	};
	public int run(){
		System.out.print("할일(입력:1, 보기:2, 끝내기:3)>> ");
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
		
		System.out.println("이번달 스케쥴 관리 프로그램.");
		
		while(true) {
			int num = april.run();
			if (num == 3) break;
			System.out.println();
		}
	}
}
