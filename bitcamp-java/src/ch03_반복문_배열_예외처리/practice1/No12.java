package ch03_반복문_배열_예외처리.practice1;

public class No12 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=0; i<args.length; i++) {
			try {
				sum += Integer.parseInt(args[i]);
			}catch(NumberFormatException e) {}
		}
		System.out.println(sum);
	}
}
