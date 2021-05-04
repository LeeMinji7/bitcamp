package day03;

// main메소드에서 5개의 인자를 받아 평균을 구하라

public class Calc2 {

	public static void main(String[] args) {

		double sum = 0.0;
		int cnt = 0;
		double avg = 0.0;
		
		for(int i=0; i<args.length; i++) {
			sum += Double.parseDouble(args[i]);
			cnt++;
		}
		
		avg = sum/cnt;
		System.out.println("평균: " + avg);
			
	}

}
