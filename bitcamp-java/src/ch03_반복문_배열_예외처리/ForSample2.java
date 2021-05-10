package ch03_반복문_배열_예외처리;

// 3의 배수, 짝수, 홀수 합

public class ForSample2 {
	public static void main(String[] args) {

		int sum = 0; // 3의 배수의 합
		int sum2 = 0; // 짝수의 합
		int sum3 = 0; // 홀수의 합
		
		for(int i = 1; i <= 10; i++) {
			if(i % 3 ==0)
				sum += i;
			
			if(i % 2 == 0)
				sum2 += i;
			else
				sum3 += i;
		}
		
		System.out.println("3의 배수의 합: " + sum);
		System.out.println("짝수의 합: " + sum2);
		System.out.println("홀수의 합: " + sum3);
	}
}
