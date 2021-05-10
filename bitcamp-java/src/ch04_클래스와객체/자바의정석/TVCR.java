package ch04_클래스와객체.자바의정석;

import java.io.IOException;
import java.sql.SQLException;

class Tv{
	boolean power; // 전원 상태(on/off)
	int channel; // 채널
	
	void power() {power = !power;}
	void channelUp() throws IOException, SQLException{++channel;}
	void channelDown() { --channel;}
}

class VCR{
	boolean power;
	int counter = 0;
	void power() { power = !power;}
	void play() {System.out.println("play 하고 있습니다.");}
	void stop() {System.out.println("stop 하고 있습니다.");}
	void rew() {System.out.println("rew 하고 있습니다.");}
	void ff() {System.out.println("ff 하고 있습니다.");}
}
public class TVCR extends Tv{
	VCR vcr = new VCR();
	int counter = vcr.counter;
	void play() {
		vcr.play();
	}
	void stop() {
		vcr.stop();
	}
	void rew() {
		vcr.rew();
	}
	void ff() {
		vcr.ff();
	}
	void channelUp() throws IOException, SQLException{
		System.out.println(++channel);
	}
	public static void main(String[] args) throws IOException, SQLException {
		TVCR tvcr = new TVCR();
		tvcr.channelUp();
	}

}
