package ch04_Ŭ�����Ͱ�ü.�ڹ�������;

import java.io.IOException;
import java.sql.SQLException;

class Tv{
	boolean power; // ���� ����(on/off)
	int channel; // ä��
	
	void power() {power = !power;}
	void channelUp() throws IOException, SQLException{++channel;}
	void channelDown() { --channel;}
}

class VCR{
	boolean power;
	int counter = 0;
	void power() { power = !power;}
	void play() {System.out.println("play �ϰ� �ֽ��ϴ�.");}
	void stop() {System.out.println("stop �ϰ� �ֽ��ϴ�.");}
	void rew() {System.out.println("rew �ϰ� �ֽ��ϴ�.");}
	void ff() {System.out.println("ff �ϰ� �ֽ��ϴ�.");}
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
