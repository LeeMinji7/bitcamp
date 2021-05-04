package day05.practice.no12;

import java.util.Scanner;

class Seat{
	String seat[][];
	String grade[] = {"S", "A", "B"};
	
	public Seat() {
		seat = new String[3][10];
		
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++)
				seat[i][j] = "---";
		}
	}
	public void reserve(int seatGrade, String name, int num) {
		seat[seatGrade-1][num-1] = name;
	}
	
	void show(int seatGrade) {
		System.out.print(grade[seatGrade-1] + ">> ");
		for(int i=0; i<10; i++) 
			System.out.print(seat[seatGrade-1][i] + " ");
		System.out.println();
	}
}

public class ReservationSystem {
	static Scanner sc = new Scanner(System.in);
	static Seat s = new Seat();
	
	static void reservation() {
		System.out.print("좌석구분 S(1), A(2), B(3) >> ");
		int seatGrade = sc.nextInt();
		
		s.show(seatGrade);
		System.out.print("이름>> ");
		String name = sc.next();
		System.out.print("번호>> ");
		int num = sc.nextInt();
		
		s.reserve(seatGrade, name, num);
	}
	static void search() {
		for(int i=1; i<=s.seat.length; i++)
			s.show(i);
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	static void cancel() {
		System.out.print("좌석 S:1, A:2, B:3 >> ");
		int seatGrade = sc.nextInt();
		
		s.show(seatGrade);
		
		System.out.print("이름>> ");
		String name = sc.next();
		
		for(int i=0; i<10; i++) {
			if(s.seat[seatGrade-1][i].equals(name))
				s.seat[seatGrade-1][i] = "---";
		}
	}		
	static boolean finish() {
		return false;
	}
	public static void main(String[] args) {
		
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		boolean state = true;
		
		while(state) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				reservation();
				break;
			case 2:
				search();
				break;
			case 3:
				cancel();
				break;
			case 4:
				state = finish();
				break;
			}
		}
	}
}
