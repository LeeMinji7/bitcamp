package ch03_�ݺ���_�迭_����ó��.practice1;

public class No11_Average {

	public static void main(String[] args) {

		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		avg = sum/args.length;
		System.out.println(avg);
	}
}
