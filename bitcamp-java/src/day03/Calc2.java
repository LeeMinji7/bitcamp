package day03;

// main�޼ҵ忡�� 5���� ���ڸ� �޾� ����� ���϶�

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
		System.out.println("���: " + avg);
			
	}

}
