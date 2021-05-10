package ch04_클래스와객체.자바의정석;

public class RepairableTest {

	public static void main(String[] args) {

		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marine marine = new Marine();
		SCV scv = new SCV();
		scv.repair(tank); // scv가 tank를 수리
//		scv.repair(marine); // 오류
	}
}
interface Repairable{}
class Unit2{
	int hitPoint;
	final int MAX_HP;
	Unit2(int hp){
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit2{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit2{
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150); // Tank의 hp는 150이다
		hitPoint = MAX_HP;
	}
	public String toSting() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable{
	Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Dropship";
	}
	
}

class Marine extends GroundUnit{
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if( r instanceof Unit2) {
			Unit2 u = (Unit2)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++; // unit의 hp를 증가
			}
		}
	}
}
